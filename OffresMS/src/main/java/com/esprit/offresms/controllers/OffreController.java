package com.esprit.offresms.controllers;

import com.esprit.offresms.entities.Offre;
import com.esprit.offresms.services.IOffreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offres")
@AllArgsConstructor
public class OffreController {
    private final IOffreService iOffreService;
    @GetMapping("")
    public List<Offre> retrieveAllOffres() {
        return iOffreService.retrieveOffres();
    }

    @PostMapping("")
    public Offre addOffre(@RequestBody Offre offre) {
        return iOffreService.addOffre(offre);
    }

    @PutMapping("")
    public Offre updateOffre(@RequestBody Offre offre) {
        return iOffreService.updateOffre(offre);
    }

    @GetMapping("/{id}")
    public Offre retrieveOffre(@PathVariable long id) {
        return iOffreService.retrieveOffre(id);
    }

    @DeleteMapping("/{id}")
    public void removeOffre(@PathVariable long id) {
        iOffreService.removeOffre(id);
    }

}
