package com.starters.hsge.domain.usecase

import com.starters.hsge.domain.repository.DogProfileRepository
import javax.inject.Inject

class GetDogAgeUseCase @Inject constructor(
    private val dogProfileRepository: DogProfileRepository
) {
    suspend fun invoke() = dogProfileRepository.getDogAge()

}