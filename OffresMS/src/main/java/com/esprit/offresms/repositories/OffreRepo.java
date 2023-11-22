package com.esprit.offresms.repositories;

import com.esprit.offresms.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepo extends JpaRepository<Offre, Long> {
}
