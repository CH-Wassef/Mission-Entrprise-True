package com.example.missionentreprisetrue.Services;

import com.example.missionentreprisetrue.Entities.Utilisateur;
import com.example.missionentreprisetrue.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(id).orElse(null);
        if (existingUtilisateur != null) {
            existingUtilisateur.setNom(utilisateur.getNom());
            existingUtilisateur.setPrenom(utilisateur.getPrenom());
            // Mettez à jour les autres champs si nécessaire
            return utilisateurRepository.save(existingUtilisateur);
        }
        return null;
    }

    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }
}
