package com.meghamlabs.roommultipletablesandrelation.entities.relations

import androidx.room.Entity
import com.meghamlabs.roommultipletablesandrelation.entities.Student

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(

val studentName: String,
val subjectName: String



)
