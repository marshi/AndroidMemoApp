package dev.marshi.memo.core.domain.model

import java.util.Date

data class MemoModel(
  val id: MemoId? = null,
  val text: String,
  val updatedAt: Date? = null,
)
