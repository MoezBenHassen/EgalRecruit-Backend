package tn.enigma.msconventions.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.enigma.msconventions.entities.Convention;
import tn.enigma.msconventions.services.ConventionService;

import java.net.URI;

@RestController("convention/")
@AllArgsConstructor
public class ConventionController {
    private ConventionService conventionService;

    @GetMapping("")
    public ResponseEntity getAllConventions(){
        try {
            return ResponseEntity.ok().body(conventionService.getConventions());
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getConventionById(@PathVariable int id){
        try {
            return ResponseEntity.ok().body(conventionService.getConventionById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("")
    public ResponseEntity addConvention(@RequestBody Convention c){
        try{
            Convention cc = conventionService.addConvention(c);
            return ResponseEntity.created(URI.create("/convention/"+cc.getId())).body(cc);
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("")
    public ResponseEntity updateConvention(@RequestBody Convention c){
        try{
            Convention cc = conventionService.updateConvention(c);
            return ResponseEntity.ok().body(cc);
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteConvention(@PathVariable int id){
        try{
            conventionService.deleteConvention(id);
            return ResponseEntity.ok().body("Deleted succesfully");
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
