package com.example.missionentreprisetrue.Services;

import com.example.missionentreprisetrue.Entities.Message;
import com.example.missionentreprisetrue.Repositories.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService{
    private final MessageRepository messageRepository;
    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
