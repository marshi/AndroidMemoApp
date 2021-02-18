package dev.marshi.repository.memo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import marshi.memo.app.core.domain.model.MemoModel
import marshi.memo.app.core.domain.repository.MemoRepository
import marshi.memo.data.db.memo.MemoDao
import javax.inject.Inject

class MemoDataSource @Inject constructor(
  private val memoDao: MemoDao
) : MemoRepository {
  override fun memoList(): Flow<List<MemoModel>> {
    return memoDao.all().map { entities ->
      entities.map { e -> MemoModel(e.id, e.memoText) }
    }
  }
}
