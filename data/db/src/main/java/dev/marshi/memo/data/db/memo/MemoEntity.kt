package dev.marshi.memo.data.db.memo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
class MemoEntity(
  @PrimaryKey(autoGenerate = true) val id: Int = defaultId,
  @ColumnInfo(name = "memo_text") val memoText: String
) {
  companion object {
    const val defaultId = 0
  }
}
