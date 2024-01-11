package com.iesam.huellas.features.pets.data;

import com.iesam.huellas.features.pets.domain.Pet;
import com.iesam.huellas.features.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {

    private ArrayList<Pet> localPets = new ArrayList<>();

    public PetDataRepository() {
        initData();
    }

    @Override
    public ArrayList<Pet> obtainPets() {
        return localPets;
    }

    @Override
    public Pet obtainPet(String petId) {
        for (Pet pet : localPets) {
            if (pet.getId().equals(petId)) {
                return pet;
            }
        }
        return null;
    }

    private void initData() {
        localPets.add(new Pet("1", "Rami", "Gato blanco", "Hembra", "01-01-2023", "https://", "Pequeño", "Europeo"));
        localPets.add(new Pet("2", "Tux", "Gato negro", "Macho", "01-01-2012", "https://", "Grande", "Europeo"));
    }
}
