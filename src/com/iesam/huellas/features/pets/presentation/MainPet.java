package com.iesam.huellas.features.pets.presentation;

import com.iesam.huellas.features.pets.data.PetDataRepository;
import com.iesam.huellas.features.pets.domain.GetPetUseCase;
import com.iesam.huellas.features.pets.domain.GetPetsUseCase;
import com.iesam.huellas.features.pets.domain.Pet;

import java.util.ArrayList;

public class MainPet {

    /**
     * Mostrar un listado de mascotas
     */
    public static void printPets(){
        GetPetsUseCase petsUseCase = new GetPetsUseCase(new PetDataRepository());
        ArrayList<Pet> pets = petsUseCase.execute();
        //imprimir cada una de las mascotas
        System.out.println(pets.toString());
    }

    public static void printPet(String petId){
        GetPetUseCase getPetUseCase = new GetPetUseCase(new PetDataRepository());
        Pet pet = getPetUseCase.execute(petId);
        System.out.println(pet.toString());
    }

    public static void deletePet(String petId){
        printPets();
        //DeletePetUseCase deletePetUseCase = new DeletePetUseCase();
        //deletePetUseCase.execute(petId);
        printPets();
    }
}
