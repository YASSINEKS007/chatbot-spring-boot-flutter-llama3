package me.projects.backend.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    public String ragChat(String question) {
        return chatClient.prompt().user(question).call().content();
    }


}
