package com.meghamlabs.roommultipletablesandrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.meghamlabs.roommultipletablesandrelation.entities.Director
import com.meghamlabs.roommultipletablesandrelation.entities.School

data class SchoolAndDirector(

    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director

)
