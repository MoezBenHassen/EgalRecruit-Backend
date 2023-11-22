package com.example.msreclamations.controllers;

import com.example.msreclamations.entities.Reclamation;
import com.example.msreclamations.services.IReclamationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reclamations")
public class ReclamationController {


    private IReclamationService reclamationService;

    // GET ALL RECLAMATION
    @GetMapping("")
    public List<Reclamation> getAllReclamations() {
        return reclamationService.findAll();
    }

    @PostMapping("")
    public Reclamation addReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.addReclamation(reclamation);
    }

    @PutMapping("/id")
    public Reclamation updateReclamation(@RequestBody Reclamation reclamation, @PathVariable Long id) {
        return reclamationService.updateReclamation(reclamation);
    }

    @GetMapping("/{id}")
    public Reclamation getReclamationById(@PathVariable Long id) {
        return reclamationService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReclamationById(@PathVariable Long id) {
        reclamationService.deleteById(id);
    }
}
