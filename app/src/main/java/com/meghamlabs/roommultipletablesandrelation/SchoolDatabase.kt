package com.meghamlabs.roommultipletablesandrelation

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.meghamlabs.roommultipletablesandrelation.entities.Director
import com.meghamlabs.roommultipletablesandrelation.entities.School
import com.meghamlabs.roommultipletablesandrelation.entities.Student
import com.meghamlabs.roommultipletablesandrelation.entities.Subject
import com.meghamlabs.roommultipletablesandrelation.entities.relations.StudentSubjectCrossRef


@Database(

    entities = [School::class,Director::class,Student::class, Subject::class,StudentSubjectCrossRef::class],
    version = 1


)
abstract class SchoolDatabase : RoomDatabase(){


    abstract val schoolDao: SchoolDao

companion object{

    private var INSTANCE: SchoolDatabase?=null

    fun getInstance(context: Context): SchoolDatabase{
        synchronized(this){
            return INSTANCE?: Room.databaseBuilder(
                context.applicationContext,
                SchoolDatabase::class.java,
                "school_db"
            ).build().also {
                INSTANCE=it
            }
        }
    }
}


}