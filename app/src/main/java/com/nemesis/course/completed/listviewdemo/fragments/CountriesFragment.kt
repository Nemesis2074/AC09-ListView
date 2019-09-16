package com.nemesis.course.completed.listviewdemo.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import com.nemesis.course.completed.listviewdemo.R
import com.nemesis.course.completed.listviewdemo.adapter.CountriesAdapter
import com.nemesis.course.completed.listviewdemo.model.Country

class CountriesFragment: Fragment() {

    private lateinit var listView: ListView
    private lateinit var adapter: CountriesAdapter
    private var countries = ArrayList<Country>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_countries, container, false)

        listView = view.findViewById(R.id.countries_listview)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupFragment()
    }

    private fun setupFragment(){

        countries = Country.loadCountries(activity!!)

        adapter = CountriesAdapter(activity!!, R.layout.item_country, countries)
        listView.adapter = adapter

        adapter.onFlagSelected { country ->
            Toast.makeText(activity!!, country.name, Toast.LENGTH_SHORT).show()
        }
    }

}