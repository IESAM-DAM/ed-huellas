package com.iesam.huellas;

import com.iesam.huellas.features.pets.domain.Pet;
import com.iesam.huellas.features.pets.presentation.MainPet;

public class Main {
    public static void main(String[] args) {
        //MainPet.printPets();
        //MainPet.printPet("2");
        Pet newPet = new Pet(
                "3",
                "Dino",
                "Perro muy amigable",
                "Macho",
                "01-01-2023",
                "https://dino.png",
                "Mediano",
                "Mixto");
        MainPet.createPet(newPet);

        newPet.setName("Dino II");
        MainPet.updatePet(newPet);
    }
}