package com.example.utils

import android.content.Context
import android.util.Log
import androidx.room.Room
import com.example.flowexample.core.App
import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.database.AppDatabase
import com.example.flowexample.core.di.modules.DatabaseModule
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SQLiteDatabaseHook
import net.sqlcipher.database.SupportFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class LocalFunction {

    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getRestService(
            context: Context,
            app: App,
            isAuthorized: Boolean,
            fromSync: Boolean
        ): RestWebService {

            val okHttpClientBuilder = OkHttpClient.Builder()

            // val logging = HttpLoggingInterceptor()
            // logging.setLevel(HttpLoggingInterceptor.Level.BODY)

            okHttpClientBuilder.connectTimeout(20000, TimeUnit.SECONDS)
            okHttpClientBuilder.readTimeout(20000, TimeUnit.SECONDS)

            //if (BuildConfig.DEBUG)
            //    okHttpClientBuilder.addInterceptor(logging)

//            if (isAuthorized)
//                okHttpClientBuilder.addInterceptor { chain ->
//                    val request = chain.request().newBuilder()
//                    .addHeader("Authorization", MyPrefs.getAccessToken(context))
//                        .build()
//                    chain.proceed(request)
//                }

           /* if (isAuthorized) {
                val authenticationInterceptorTokenExpired =
                    AuthenticationInterceptorRefreshToken(context, app, fromSync)
                okHttpClientBuilder.addInterceptor(authenticationInterceptorTokenExpired)
                Log.d("clouderrr", "getRestService: local function is authorized  ")
            }

            */
            Log.d("clouderrr", "getRestService: local function after is authorized")

            val builder = Retrofit.Builder()

            Retrofit.Builder()
            builder.baseUrl(GlobalVars.BASE_URL)
            builder.addConverterFactory(GsonConverterFactory.create())
            builder.client(okHttpClientBuilder.build())

            if (!fromSync)
                builder.addCallAdapterFactory(RetryCllAdapterFactory.create(app.mActivity))

            return builder.build()
                .create(RestWebService::class.java)


        }

        fun printLn(s: String) {
            Log.d("tag", "printLn: ${s}")

        }

        fun getAppDatabase(mContext: Context, dbName: String): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class.java) {
                    if (INSTANCE == null) {
                        val builder = Room.databaseBuilder(
                            mContext,
                            AppDatabase::class.java,
                            dbName
                        )
                        val hook: SQLiteDatabaseHook = object : SQLiteDatabaseHook {
                            override fun preKey(database: SQLiteDatabase?) {}
                            override fun postKey(database: SQLiteDatabase) {
                                printLn("postKey>>>>>>>>>>>>>>")
                                database.rawExecSQL("PRAGMA cipher_memory_security = OFF;")
                            }
                        }
                        val factory = SupportFactory(
                            SQLiteDatabase.getBytes(DatabaseModule.EN_KEY.toCharArray()),
                            hook
                        )
                        builder.openHelperFactory(factory)
                        builder.fallbackToDestructiveMigration()
                        builder.enableMultiInstanceInvalidation()

                        INSTANCE = builder.build()
                    }
                }
            }
            printLn("INSTANCE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + INSTANCE)
            return INSTANCE!!
        }

    }
}