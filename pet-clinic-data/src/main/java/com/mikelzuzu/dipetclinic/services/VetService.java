package com.mikelzuzu.dipetclinic.services;

import com.mikelzuzu.dipetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
