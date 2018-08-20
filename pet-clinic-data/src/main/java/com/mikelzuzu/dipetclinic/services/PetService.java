package com.mikelzuzu.dipetclinic.services;

import com.mikelzuzu.dipetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
