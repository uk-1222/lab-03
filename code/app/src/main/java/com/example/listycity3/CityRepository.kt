package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    val cities: List<City>
        get() = _cities

    fun addCity(city: City){
        _cities.add(city)
    }
    fun editCity(city: City, newCity: City){
        val i = _cities.indexOf(city)
        if(i != -1){
            _cities[i] = newCity
        }
    }
}