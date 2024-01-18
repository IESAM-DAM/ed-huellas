package com.iesam.huellas.features.pets.domain;

public class SavePetUseCase {

    private PetRepository petRepository;

    public SavePetUseCase(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public void execute(Pet pet){
        this.petRepository.savePet(pet);
    }

}
