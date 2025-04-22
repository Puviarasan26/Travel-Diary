package com.example.diaryforexplorers.domain.repository

import com.example.diaryforexplorers.common.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun login(email: String, password: String)

    suspend fun register(email: String, password: String)
}