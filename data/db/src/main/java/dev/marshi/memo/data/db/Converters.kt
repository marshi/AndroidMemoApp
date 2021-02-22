package dev.marshi.memo.data.db

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.Date

class Converters {

  companion object {
    private val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  }

  @TypeConverter
  fun timestampToDate(timestamp: String): Date? {
    return format.parse(timestamp)
  }

  @TypeConverter
  fun dateToTimestamp(date: Date?): String {
    return format.format(date)
  }
}
