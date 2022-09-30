package com.cannybits.heroesapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.cannybits.heroesapp.data.local.dao.HeroDao
import com.cannybits.heroesapp.domain.model.Hero
import com.cannybits.heroesapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class CannyvilleDatabase:RoomDatabase() {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKey
}