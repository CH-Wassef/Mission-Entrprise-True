package com.example.missionentreprisetrue.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenu;
    private Date dateCreation;

    @ManyToOne
    @JsonIgnore // Ignore during serialization
    private Publication publication;

    @ManyToOne
    @JsonIgnore // Ignore during serialization
    private Utilisateur utilisateur;

    @JsonProperty("publication_id") // Use a different name during deserialization
    public void setPublicationId(Long publicationId) {
        if (this.publication == null) {
            this.publication = new Publication();
        }
        this.publication.setId(publicationId);
    }
}
