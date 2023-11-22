package tn.enigma.msconventions.services;

import tn.enigma.msconventions.entities.Convention;

import java.util.List;

public interface ConventionService {
    List<Convention> getConventions();
    Convention getConventionById(int id);
    Convention addConvention(Convention c);
    Convention updateConvention(Convention c);
    void deleteConvention(int id);
}
