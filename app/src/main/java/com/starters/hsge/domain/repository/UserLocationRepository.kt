package com.starters.hsge.domain.repository

interface UserLocationRepository {

    suspend fun getNeighborDogProfile()

    suspend fun postUserLocation()

    suspend fun postUserDistanceRange()
}