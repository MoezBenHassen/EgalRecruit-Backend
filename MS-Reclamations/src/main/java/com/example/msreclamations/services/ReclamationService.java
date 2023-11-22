package com.example.msreclamations.services;

import com.example.msreclamations.entities.Reclamation;
import com.example.msreclamations.repositories.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService implements IReclamationService{

    @Autowired
    ReclamationRepository reclamationRepo;
    @Override
    public List<Reclamation> findAll() {
        return reclamationRepo.findAll();
    }

    @Override
    public Reclamation findById(Long id) {
        return reclamationRepo.findById(id).orElse(null);
    }

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);
    }

    @Override
    public Reclamation updateReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);
    }

    @Override
    public void deleteById(Long id) {
        reclamationRepo.deleteById(id);
    }
}
