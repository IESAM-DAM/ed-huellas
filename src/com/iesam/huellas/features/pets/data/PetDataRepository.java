package com.iesam.huellas.features.pets.data;

import com.iesam.huellas.features.pets.domain.Pet;
import com.iesam.huellas.features.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {
    @Override
    public ArrayList<Pet> obtainPets() {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("1", "MySQL", "Gato blanco", "Hembra","01-01-2023" ,"https://"));
        pets.add(new Pet("2", "MySQL", "Gato negro", "Macho","01-01-2012" ,"https://"));
        return pets;
    }

    @Override
    public void deletePets() {

    }
}
