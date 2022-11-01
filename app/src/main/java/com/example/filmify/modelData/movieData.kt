package com.example.filmify.modelData

import com.google.gson.annotations.SerializedName

class movieData (
    val Year: String,
    val Title: String,
    @SerializedName("sa")) {

}