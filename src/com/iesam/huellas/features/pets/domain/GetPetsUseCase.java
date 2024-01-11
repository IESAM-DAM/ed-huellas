package com.iesam.huellas.features.pets.domain;

import java.util.ArrayList;

public class GetPetsUseCase  {

    private PetRepository petRepository;

    public GetPetsUseCase(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public ArrayList<Pet> execute(){
        return petRepository.obtainPets();
    }
}
