package com.esprit.offresms.services;

import com.esprit.offresms.entities.Offre;

import java.util.List;

public interface IOffreService {
    List<Offre> retrieveOffres();

    Offre updateOffre(Offre offre);

    Offre addOffre(Offre offre);

    Offre retrieveOffre(long id);

    void removeOffre(long id);
}
