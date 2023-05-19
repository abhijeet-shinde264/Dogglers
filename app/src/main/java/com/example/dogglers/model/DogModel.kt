package com.example.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DogModel(
    @DrawableRes val imageDog : Int,
    //@StringRes val name: Int,
    //@StringRes val age: Int,
    //@StringRes val hobbies: Int
    val name: String,
    val age: String,
    val hobbie: String
)
