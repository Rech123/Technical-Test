package com.example.flowexample.core.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Favourit")
class Favourit {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id :Int=0

    @ColumnInfo(name = "imageUrl")
    var imageUrl :String=""

    @ColumnInfo(name = "breedname")
    var breedname :String=""











}