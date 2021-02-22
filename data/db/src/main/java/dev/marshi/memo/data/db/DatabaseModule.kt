package dev.marshi.memo.data.db

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.marshi.memo.data.db.entity.memo.MemoDao
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

  @Provides
  @Singleton
  fun providesDatabase(@ApplicationContext context: Context): AppDatabase {
    return Room.databaseBuilder(context, AppDatabase::class.java, "memo")
      .build()
  }

  @Provides
  @Singleton
  fun providesMemoDao(db: AppDatabase): MemoDao {
    return db.memoDao()
  }

  @Provides
  @Singleton
  @Named("str")
  fun provideTestStr(): String {
    return "aiueo"
  }
}
