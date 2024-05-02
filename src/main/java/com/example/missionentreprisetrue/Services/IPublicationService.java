package com.example.missionentreprisetrue.Services;

import com.example.missionentreprisetrue.Entities.Publication;

import java.util.List;

public interface IPublicationService {
    List<Publication> getAllPublications();

    Publication getPublicationById(Long id);

    Publication createPublication(Publication publication);

    Publication updatePublication(Long id, Publication newPublication);

    void deletePublication(Long id);
}
