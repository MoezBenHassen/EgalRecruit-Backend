package tn.enigma.msconventions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.enigma.msconventions.entities.Convention;

@Repository
public interface ConventionRepository extends JpaRepository<Convention, Integer> {
}
