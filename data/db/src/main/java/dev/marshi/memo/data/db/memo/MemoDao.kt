package dev.marshi.memo.data.db.memo

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface MemoDao {
  @Query("SELECT * FROM memo")
  fun all(): Flow<List<MemoEntity>>

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun insert(memo: MemoEntity)

  @Delete
  suspend fun delete(memo: MemoEntity)

  @Query("select * from memo where id = :memoId")
  suspend fun select(memoId: Int): MemoEntity?
}
