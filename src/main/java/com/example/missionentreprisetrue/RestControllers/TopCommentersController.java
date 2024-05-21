package com.example.missionentreprisetrue.RestControllers;

import com.example.missionentreprisetrue.Entities.Utilisateur;
import com.example.missionentreprisetrue.Services.TopCommentersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Utilisateur")
public class TopCommentersController {
    @Autowired
    private TopCommentersService topCommentersService;

    @GetMapping("/top-commenters")
    public List<Utilisateur> getTopCommenters() {
        return topCommentersService.getTopCommenters();
    }
}
