package com.meghamlabs.roommultipletablesandrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.meghamlabs.roommultipletablesandrelation.entities.Student
import com.meghamlabs.roommultipletablesandrelation.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>

)
