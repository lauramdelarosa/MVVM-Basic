package com.delarosa.mvvmbasic.model

interface TimeRepository {
    fun generateDate(): TimeDto
}