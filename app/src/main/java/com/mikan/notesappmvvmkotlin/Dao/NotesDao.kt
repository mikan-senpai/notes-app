package com.mikan.notesappmvvmkotlin.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.mikan.notesappmvvmkotlin.Model.Notes

@Dao
interface NotesDao {
/*
in any data base you need queries to fetch the data
this is for room query
*/

    @Query("SELECT * FROM Notes")
    fun getNotes(): LiveData<List<Notes>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(notes: Notes)

    @Query("DELETE FROM Notes WHERE id=:")
    fun deleteNotes(id: Int)

    @Update
    fun updateNotes(notes: Notes)
}