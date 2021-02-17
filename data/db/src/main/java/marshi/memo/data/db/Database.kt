package marshi.memo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import marshi.memo.data.db.memo.MemoDao
import marshi.memo.data.db.memo.MemoEntity
import javax.inject.Inject
import javax.inject.Singleton

@Database(entities = [MemoEntity::class], version = 1)
abstract class Database() : RoomDatabase() {
  abstract fun memoDao(): MemoDao
}
