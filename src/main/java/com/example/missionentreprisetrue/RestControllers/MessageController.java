package com.example.missionentreprisetrue.RestControllers;

import com.example.missionentreprisetrue.Entities.Message;
import com.example.missionentreprisetrue.Services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("message")
@AllArgsConstructor
@CrossOrigin("*")
public class MessageController {
    private final MessageService messageService;
    @PostMapping
    public Message sendMessassge(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    @GetMapping
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }
}
