package com.example.missionentreprisetrue.Services;

import com.example.missionentreprisetrue.Entities.Utilisateur;
import com.example.missionentreprisetrue.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopCommentersService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getTopCommenters() {
        // Logique pour obtenir les utilisateurs ayant fait le plus de commentaires
        return utilisateurRepository.findTopCommenters();
    }
}
