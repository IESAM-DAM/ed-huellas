package com.iesam.huellas.features.pets.data;

import com.iesam.huellas.features.pets.domain.Pet;
import com.iesam.huellas.features.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {

    private static PetDataRepository instance = null;

    private ArrayList<Pet> localPets = new ArrayList<>();

    private PetDataRepository() {
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

    @Override
    public void deletePet (String petId) {
        for (int i=0; i<localPets.size(); i++) {
            if (localPets.get(i).getId().equals(petId))
                localPets.remove(i);
        }
    }

    @Override
    public void savePet(Pet pet) {
        localPets.add(pet);
    }

    @Override
    public void updatePet(Pet pet) {
        deletePet(pet.getId());
        savePet(pet);
    }

    private void initData() {
        localPets.add(new Pet("1", "Rami", "Gato blanco", "Hembra", "01-01-2023", "https://", "Pequeño", "Europeo"));
        localPets.add(new Pet("2", "Tux", "Gato negro", "Macho", "01-01-2012", "https://", "Grande", "Europeo"));
    }

    public static PetDataRepository newInstance(){
        if (instance == null){
            instance = new PetDataRepository();
        }
        return instance;
    }
}
