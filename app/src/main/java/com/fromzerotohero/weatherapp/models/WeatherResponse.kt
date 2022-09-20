package com.fromzerotohero.weatherapp.models

import java.io.Serializable

data class WeatherResponse(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main:Main,
    val visibility:Int,
    val wind:Wind,
    val cloud:Clouds,
    val dt:Int,
    val sys:Sys,
    val id:Int,
    val name:String
):Serializable