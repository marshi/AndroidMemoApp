package dev.marshi.memo.data.db.entity.memo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "memo")
class MemoEntity(
  @PrimaryKey(autoGenerate = true) val id: Int = defaultId,
  @ColumnInfo(name = "memo_text") val memoText: String,
  @ColumnInfo(name = "updated_at") val updatedAt: Date,
) {
  companion object {
    const val defaultId = 0
  }
}
