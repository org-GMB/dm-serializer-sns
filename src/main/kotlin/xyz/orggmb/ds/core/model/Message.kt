package xyz.orggmb.ds.core.model

import java.time.LocalDateTime

data class Message(
    val sender: String,

    val receiver: String?,

    val sendAt: LocalDateTime,

    val platform: String,
)
