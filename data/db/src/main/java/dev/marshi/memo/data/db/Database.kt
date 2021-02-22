package dev.marshi.memo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.marshi.memo.data.db.entity.memo.MemoDao
import dev.marshi.memo.data.db.entity.memo.MemoEntity

@Database(entities = [MemoEntity::class], version = 2)
@TypeConverters(Converters::class)
abstract class AppDatabase() : RoomDatabase() {
  abstract fun memoDao(): MemoDao
}
