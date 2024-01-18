package com.iesam.huellas.features.pets.domain;

public class UpdatePetUseCase {

    private PetRepository petRepository;

    public UpdatePetUseCase(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public void execute(Pet pet){
        this.petRepository.updatePet(pet);
    }

}
