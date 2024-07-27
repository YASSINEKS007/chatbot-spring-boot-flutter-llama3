package me.projects.backend.web;

import me.projects.backend.services.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatRetsController {
    private ChatService chatService;
    public ChatRetsController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/question")
    public String response(@RequestBody String question) {
        return chatService.ragChat(question);
    }
}
