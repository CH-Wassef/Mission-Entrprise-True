package com.example.missionentreprisetrue.RestControllers;


import com.example.missionentreprisetrue.Entities.Publication;
import com.example.missionentreprisetrue.Repositories.PublicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Publication")
@AllArgsConstructor
@CrossOrigin("*")
public class PublicationController {
    @Autowired
    private PublicationRepository publicationRepository;

    @GetMapping("/")
    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Publication getPublicationById(@PathVariable Long id) {
        return publicationRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Publication createPublication(@RequestBody Publication publication) {

        return publicationRepository.save(publication);
    }

    @PutMapping("/{id}")
    public Publication updatePublication(@PathVariable Long id, @RequestBody Publication newPublication) {
        Optional<Publication> optionalPublication = publicationRepository.findById(id);
        if (optionalPublication.isPresent()) {
            Publication existingPublication = optionalPublication.get();
            existingPublication.setTitre(newPublication.getTitre()); // Update other fields as needed
            existingPublication.setContenu(newPublication.getContenu());
            existingPublication.setDateCreation(newPublication.getDateCreation());
            // Do not update commentaires here
            return publicationRepository.save(existingPublication);
        } else {
            // Handle case where publication with given id is not found
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletePublication(@PathVariable Long id) {
        publicationRepository.deleteById(id);
    }
}
