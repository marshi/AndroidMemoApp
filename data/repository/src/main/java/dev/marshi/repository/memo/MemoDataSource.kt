package dev.marshi.repository.memo

import dev.marshi.memo.core.domain.model.MemoId
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.core.domain.repository.MemoRepository
import dev.marshi.memo.data.db.entity.memo.MemoDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MemoDataSource @Inject constructor(
  private val memoDao: MemoDao
) : MemoRepository {
  override fun memoList(): Flow<List<MemoModel>> {
    return memoDao.all().map { entities ->
      entities.map { e -> MemoModel(MemoId(e.id), e.memoText) }
    }
  }

  override suspend fun delete(model: MemoModel) {
    memoDao.delete(model.toEntity())
  }

  override suspend fun insert(memoModel: MemoModel) {
    memoDao.insert(memoModel.toEntity())
  }

  override suspend fun select(memoId: Int): MemoModel? {
    return memoDao.select(memoId)?.toModel()
  }
}
