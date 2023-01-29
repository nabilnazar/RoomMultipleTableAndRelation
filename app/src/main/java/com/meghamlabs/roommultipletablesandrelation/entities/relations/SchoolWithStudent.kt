package com.meghamlabs.roommultipletablesandrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.meghamlabs.roommultipletablesandrelation.entities.School
import com.meghamlabs.roommultipletablesandrelation.entities.Student

data class SchoolWithStudent(

    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>

)
