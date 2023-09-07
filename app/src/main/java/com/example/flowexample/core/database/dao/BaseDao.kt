package com.example.flowexample.core.database.dao

import androidx.room.*

@Dao
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(t: T): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(list: List<T>):List<Long>

    @Update
    fun update(t: T)

    @Delete
    fun delete(t: T)
}