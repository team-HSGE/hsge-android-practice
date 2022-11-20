package com.starters.hsge.domain.repository

interface UserProfileRepository {

    suspend fun getUserNickName()

    suspend fun getUserProfileIcon()

    suspend fun postUserNickName()

    suspend fun postUserProfileIcon()
}