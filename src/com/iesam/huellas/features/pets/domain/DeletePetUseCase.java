package com.iesam.huellas.features.pets.domain;

import java.util.ArrayList;

public class DeletePetUseCase {
    private PetRepository petRepository;

    public DeletePetUseCase(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void execute(String petId){
        petRepository.deletePet(petId);
    }
}
