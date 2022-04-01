package com.mikan.notesappmvvmkotlin.Repository

import androidx.lifecycle.LiveData
import com.mikan.notesappmvvmkotlin.Dao.NotesDao
import com.mikan.notesappmvvmkotlin.Model.Notes

class NotesRepository(val dao: NotesDao) {

    fun getallNotes(): LiveData<List<Notes>> {
        return dao.getNotes()
    }

    fun insertNotes(notes: Notes) {
        dao.insertNotes(notes)
    }

    fun deleteNotes(id: Int) {
        dao.deleteNotes(id)
    }

    fun updateNotes(notes: Notes) {
        dao.updateNotes(notes)
    }

}