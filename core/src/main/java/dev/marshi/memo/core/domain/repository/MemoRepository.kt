package dev.marshi.memo.core.domain.repository

import kotlinx.coroutines.flow.Flow
import dev.marshi.memo.core.domain.model.MemoModel

interface MemoRepository {

  fun memoList(): Flow<List<MemoModel>>
}
