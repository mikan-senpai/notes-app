package com.mikan.notesappmvvmkotlin.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

// this is the model class
@Entity(tableName = "Notes")
class Notes(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var title: String,
    var subTitle: String,
    var notes: String,
    var data: String,
    var priority: String

)