package dev.marshi.memo.core.domain.repository

import dev.marshi.memo.core.domain.model.MemoModel
import kotlinx.coroutines.flow.Flow

interface MemoRepository {

  fun memoList(): Flow<List<MemoModel>>

  suspend fun delete(model: MemoModel)

  suspend fun insert(memoModel: MemoModel)

  suspend fun select(memoId: Int): MemoModel?
}
