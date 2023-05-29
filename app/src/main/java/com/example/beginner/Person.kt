package com.example.beginner

import java.io.Serializable

// purpose is of data cass is to hold data and has a constructor only
// passsing a whole class

data class Person (
    val name: String,
    val age: Int,
    val country: String
    ) : Serializable