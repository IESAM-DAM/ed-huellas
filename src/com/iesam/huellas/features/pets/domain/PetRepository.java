package com.iesam.huellas.features.pets.domain;

import java.util.ArrayList;
import java.util.List;

public interface PetRepository {
    ArrayList<Pet> obtainPets();

    void deletePets();
}
