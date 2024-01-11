package com.iesam.huellas.features.pets.domain;

public class GetPetUseCase {

    private PetRepository petRepository;

    public GetPetUseCase(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet execute(String petId){
        return this.petRepository.obtainPet(petId);
    }
}
