
package com.example.missionentreprisetrue.Repositories;

import com.example.missionentreprisetrue.Entities.Commentaire;
import com.example.missionentreprisetrue.Entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
