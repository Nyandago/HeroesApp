package com.cannybits.heroesapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cannybits.heroesapp.data.local.dao.HeroDao
import com.cannybits.heroesapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class CannyvilleDatabase:RoomDatabase() {
    abstract fun heroDao(): HeroDao
}