package com.example.missionentreprisetrue.RestControllers;

import com.example.missionentreprisetrue.Entities.Utilisateur;
import com.example.missionentreprisetrue.Services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    // Création d'un nouvel utilisateur
    @PostMapping("/")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.saveUtilisateur(utilisateur);
    }

    // Récupérer tous les utilisateurs
    @GetMapping("/")
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }

    // Récupérer un utilisateur par ID
    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

    // Mettre à jour un utilisateur
    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(id, utilisateur);
    }

    // Supprimer un utilisateur
    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteUtilisateur(id);
    }

    // Autres méthodes spécifiques aux utilisateurs peuvent être ajoutées ici
}
