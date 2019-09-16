package com.nemesis.course.completed.listviewdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nemesis.course.completed.listviewdemo.R
import com.nemesis.course.completed.listviewdemo.model.Country

class CountriesAdapter(context:Context, resourceId:Int, countries: ArrayList<Country>) : ArrayAdapter<Country>(context, resourceId, countries) {

    private var selectedBlock:((country:Country) -> Unit) = {}

    fun onFlagSelected(selected:(country:Country) -> Unit){
        selectedBlock = selected
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        if(convertView == null){
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.item_country, parent, false)
        }

        val country = getItem(position)

        if(country != null && view != null){

            val imgFlag: ImageView = view.findViewById(R.id.item_country_flag)
            val txtName: TextView = view.findViewById(R.id.item_country_name)

            imgFlag.setImageResource(country.flag)
            txtName.text = country.name

            view.setOnClickListener {
                selectedBlock(country)
            }

        }

        return view!!

    }
}