package com.example.diaryforexplorers.data.repository

import com.example.diaryforexplorers.common.Resource
import com.example.diaryforexplorers.domain.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val firebaseAuth: FirebaseAuth): AuthRepository {
    override suspend fun login(email: String, password: String) {
        firebaseAuth
            .signInWithEmailAndPassword(email, password)
            .await()
    }

    override suspend fun register(email: String, password: String) {
        firebaseAuth
            .createUserWithEmailAndPassword(email, password)
            .await()
    }
    }