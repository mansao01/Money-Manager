package com.mansao.moneymanager.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Money::class], version = 1)
abstract class MoneyDatabase : RoomDatabase() {
    abstract fun moneyDao(): MoneyDao

    companion object{
        @Volatile
        private var INSTANCE: MoneyDatabase? = null

        fun getInstance(context: Context): MoneyDatabase =
            INSTANCE?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    MoneyDatabase::class.java,
                    "money.db"
                ).build().apply {
                    INSTANCE = this
                }
            }
    }
}