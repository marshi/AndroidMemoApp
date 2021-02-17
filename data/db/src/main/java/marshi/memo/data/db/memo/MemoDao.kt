package marshi.memo.data.db.memo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MemoDao {
  @Query("SELECT * FROM memo")
  fun all(): List<MemoEntity>

  @Insert
  suspend fun insert(memo: MemoEntity)
}