package dev.marshi.repository.memo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.core.domain.repository.MemoRepository
import dev.marshi.memo.data.db.memo.MemoDao
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
