package marshi.memo.app.core.domain.repository

import kotlinx.coroutines.flow.Flow
import marshi.memo.app.core.domain.model.MemoModel

interface MemoRepository {

  fun memoList(): Flow<List<MemoModel>>
}
