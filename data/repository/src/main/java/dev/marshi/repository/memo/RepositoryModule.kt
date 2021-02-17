package dev.marshi.repository.memo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import marshi.memo.app.core.domain.repository.MemoRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface RepositoryModule {

  @Singleton
  @Binds
  fun bindsMemoDataSource(dataSource: MemoDataSource): MemoRepository
}
