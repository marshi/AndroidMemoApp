package dev.marshi.memo.data.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.marshi.memo.data.db.memo.MemoDao
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

  @Provides
  @Singleton
  fun providesDatabase(@ApplicationContext context: Context): Database {
    return Room.databaseBuilder(context, Database::class.java, "memo").build()
  }

  @Provides
  @Singleton
  fun providesMemoDao(db: Database): MemoDao {
    return db.memoDao()
  }

  @Provides
  @Singleton
  @Named("str")
  fun provideTestStr(): String {
    return "aiueo"
  }
}
