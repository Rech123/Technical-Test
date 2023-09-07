package com.example.flowexample.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.flowexample.core.database.dao.FavDao


@Database(entities = [Favourit::class],version=2

)
abstract class AppDatabase  : RoomDatabase(){
    abstract fun favDao(): FavDao

}