package tn.enigma.msconventions.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.enigma.msconventions.entities.Convention;
import tn.enigma.msconventions.repositories.ConventionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ConventionServiceImpl implements ConventionService {
    private ConventionRepository repo;
    @Override
    public List<Convention> getConventions() {
        return (repo.findAll().isEmpty() ? null : repo.findAll());
    }

    @Override
    public Convention getConventionById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Convention addConvention(Convention c) {
        return repo.save(c);
    }

    @Override
    public Convention updateConvention(Convention c) {
        return repo.save(c);
    }

    @Override
    public void deleteConvention(int id) {
        repo.deleteById(id);
    }
}
