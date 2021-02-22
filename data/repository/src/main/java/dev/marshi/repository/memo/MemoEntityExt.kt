package dev.marshi.repository.memo

import dev.marshi.memo.core.domain.model.MemoId
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.data.db.entity.memo.MemoEntity
import java.util.Calendar

fun MemoEntity.toModel() = MemoModel(MemoId(id), memoText)

fun MemoModel.toEntity() =
  MemoEntity(id?.value ?: MemoEntity.defaultId, text, updatedAt ?: Calendar.getInstance().time)
