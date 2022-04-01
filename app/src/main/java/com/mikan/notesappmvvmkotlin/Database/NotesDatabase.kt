package com.mikan.notesappmvvmkotlin.Database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mikan.notesappmvvmkotlin.Dao.NotesDao

/* abstract case functions have no body */

abstract class NotesDatabase : RoomDatabase() {
    abstract fun myNotesDao(): NotesDao

    /* companion object is just like static in java */
    companion object {
        /* @Volatile means you can easily access the data */
        @Volatile
        var INSTANCE: NotesDatabase? = null

        fun getDatabaseInstance(context: Context):NotesDatabase{

            val tempInstnce= INSTANCE
            if(tempInstnce!= null ){
                return tempInstnce
            }
            synchronized(this){
                val roomDatabaseInstance= Room.databaseBuilder(context,NotesDatabase::class.java,"Notes").build()
                INSTANCE=roomDatabaseInstance
                return return roomDatabaseInstance
            }
        }
    }
}