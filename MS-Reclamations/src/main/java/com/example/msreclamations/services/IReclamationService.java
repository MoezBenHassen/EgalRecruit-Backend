package com.example.msreclamations.services;

import com.example.msreclamations.entities.Reclamation;

import java.util.List;

public interface IReclamationService {
    List<Reclamation> findAll();
    Reclamation findById(Long id);
    //add reclamation
    Reclamation addReclamation(Reclamation reclamation);
    //update reclamation
    Reclamation updateReclamation(Reclamation reclamation);
    void deleteById(Long id);

}
