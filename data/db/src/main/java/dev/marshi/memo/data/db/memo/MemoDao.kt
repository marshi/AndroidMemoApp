package dev.marshi.memo.data.db.memo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MemoDao {
  @Query("SELECT * FROM memo")
  fun all(): Flow<List<MemoEntity>>

  @Insert
  suspend fun insert(memo: MemoEntity)
}
