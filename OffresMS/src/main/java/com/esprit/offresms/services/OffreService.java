package com.esprit.offresms.services;

import com.esprit.offresms.entities.Offre;
import com.esprit.offresms.repositories.OffreRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OffreService implements IOffreService{
    OffreRepo offreRepo;
    @Override
    public List<Offre> retrieveOffres() {
        return offreRepo.findAll();
    }

    @Override
    public Offre updateOffre(Offre offre) {
        return offreRepo.save(offre);
    }

    @Override
    public Offre addOffre(Offre offre) {
        return offreRepo.save(offre);
    }

    @Override
    public Offre retrieveOffre(long id) {
        return offreRepo.findById(id).orElse(null);
    }

    @Override
    public void removeOffre(long id) {
     offreRepo.deleteById(id);
    }
}
