package com.example.flowexample.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.flowexample.core.database.Favourit

@Dao
interface FavDao :BaseDao<Favourit>{
    @Query("SELECT * FROM Favourit")
    fun getAllFAv(): List<Favourit>?

    @Query("SELECT * FROM Favourit where   breedname=:breedname AND imageUrl=:imageUrl")
     fun getFavByImageUrlAndBreedName(imageUrl: String, breedname: String): Favourit?

    @Query("Delete  FROM Favourit where   breedname=:breedname AND imageUrl=:imageUrl")

     fun removeFaveByImageUrlAndBreedName(imageUrl: String, breedname: String)

     @Query("SELECT * FROM Favourit where   breedname=:breadNameFilter")
    fun getFavByBreadName(breadNameFilter: String): List<Favourit>?


}