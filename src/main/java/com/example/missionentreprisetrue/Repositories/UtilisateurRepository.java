package com.example.missionentreprisetrue.Repositories;

import com.example.missionentreprisetrue.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    @Query("SELECT u FROM Utilisateur u JOIN u.commentaires c GROUP BY u ORDER BY COUNT(c) DESC")
    List<Utilisateur> findTopCommenters();
}
