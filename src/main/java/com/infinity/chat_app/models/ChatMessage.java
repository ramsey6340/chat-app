package com.infinity.chat_app.models;

import com.infinity.chat_app.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
