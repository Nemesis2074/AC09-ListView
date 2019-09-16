package com.nemesis.course.completed.listviewdemo.model

import android.content.Context
import android.support.annotation.DrawableRes
import com.nemesis.course.completed.listviewdemo.R

class Country(val name:String, @DrawableRes val flag:Int) {

    companion object{

        fun loadCountries(context: Context): ArrayList<Country>{

            val countries = ArrayList<Country>()

            val country01 = Country( context.getString(R.string.country_01), R.drawable.country_01)
            countries.add(country01)

            val country02 = Country( context.getString(R.string.country_02), R.drawable.country_02)
            countries.add(country02)

            val country03 = Country( context.getString(R.string.country_03), R.drawable.country_03)
            countries.add(country03)

            val country04 = Country( context.getString(R.string.country_04), R.drawable.country_04)
            countries.add(country04)

            val country05 = Country( context.getString(R.string.country_05), R.drawable.country_05)
            countries.add(country05)

            val country06 = Country( context.getString(R.string.country_06), R.drawable.country_06)
            countries.add(country06)

            val country07 = Country( context.getString(R.string.country_07), R.drawable.country_07)
            countries.add(country07)

            val country08 = Country( context.getString(R.string.country_08),  R.drawable.country_08)
            countries.add(country08)

            val country09 = Country( context.getString(R.string.country_09), R.drawable.country_09)
            countries.add(country09)

            val country10 = Country( context.getString(R.string.country_10), R.drawable.country_10)
            countries.add(country10)

            val country11 = Country( context.getString(R.string.country_11),  R.drawable.country_11)
            countries.add(country11)

            val country12 = Country( context.getString(R.string.country_12),  R.drawable.country_12)
            countries.add(country12)

            val country13 = Country( context.getString(R.string.country_13),  R.drawable.country_13)
            countries.add(country13)

            val country14 = Country( context.getString(R.string.country_14),  R.drawable.country_14)
            countries.add(country14)

            val country15 = Country( context.getString(R.string.country_15), R.drawable.country_15)
            countries.add(country15)

            val country16 = Country( context.getString(R.string.country_16), R.drawable.country_16)
            countries.add(country16)

            return countries
        }

    }

}