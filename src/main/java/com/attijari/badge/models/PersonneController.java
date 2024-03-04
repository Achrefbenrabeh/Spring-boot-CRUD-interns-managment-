package com.attijari.badge.models;

import com.attijari.badge.Security.dto.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("api/v1/personnes")
public class PersonneController {




    @Autowired
    private PersonneRepository personneRepository;



    @GetMapping
    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personne> getPersonneById(@PathVariable Long id) {
        Optional<Personne> personne = personneRepository.findById(id);
        return personne.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Personne> createPersonne(@RequestBody Personne personne) {
        Personne savedPersonne = personneRepository.save(personne);
        return ResponseEntity.created(URI.create("/personnes/" + savedPersonne.getId())).body(savedPersonne);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Personne> updatePersonne(@PathVariable Long id, @RequestBody Personne personne) {
        if (!personneRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        personne.setId(id);
        Personne savedPersonne = personneRepository.save(personne);
        return ResponseEntity.ok(savedPersonne);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonne(@PathVariable Long id) {
        if (!personneRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        personneRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
