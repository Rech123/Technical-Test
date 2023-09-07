package com.example.flowexample.core.di.modules

import android.content.Context
import com.example.flowexample.core.database.AppDatabase
import com.example.utils.LocalFunction
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    companion object {
        val mDBName = "veracity_database.db"
        val EN_KEY = "Verac!ty@dbEncr!ptEd01!!"
    }

    @Provides
    fun provideDatabase(mContext: Context): AppDatabase {
        return LocalFunction.getAppDatabase(mContext, mDBName)
    }
/*
    @Provides
    fun provideAssetCategoryDao(db: AppDatabase): AssetCategoryDao {
        return db.assetCategoryDao()
    }

 */
}