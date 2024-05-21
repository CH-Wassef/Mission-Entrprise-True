package com.example.missionentreprisetrue.Services;

import com.example.missionentreprisetrue.Entities.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
    Message saveMessage(Message message);
}
