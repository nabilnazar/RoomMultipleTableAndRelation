package com.meghamlabs.roommultipletablesandrelation.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject (

    @PrimaryKey(autoGenerate = false)
    val subjectName: String
        )