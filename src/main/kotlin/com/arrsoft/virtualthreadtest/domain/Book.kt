package com.arrsoft.virtualthreadtest.domain

import java.util.UUID

data class Book (
    val id: UUID,
    val name: String,
    val description: String
)
