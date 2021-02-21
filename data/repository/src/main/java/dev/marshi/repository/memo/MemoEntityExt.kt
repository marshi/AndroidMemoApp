package dev.marshi.repository.memo

import dev.marshi.memo.core.domain.model.MemoId
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.data.db.memo.MemoEntity

fun MemoEntity.toModel() = MemoModel(MemoId(id), memoText)

fun MemoModel.toEntity() = MemoEntity(id?.value ?: MemoEntity.defaultId, text)
