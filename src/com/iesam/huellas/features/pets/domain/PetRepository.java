package com.iesam.huellas.features.pets.domain;

import java.util.ArrayList;
import java.util.List;

public interface PetRepository {
    ArrayList<Pet> obtainPets();
    Pet obtainPet(String petId);
}
