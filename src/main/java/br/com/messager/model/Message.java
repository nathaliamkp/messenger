package br.com.messager.model;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Message {

    private Integer id;
    private Conversation conversation;
    private LocalDateTime date;
    private MessageType type;
    private User sender;
    private String messagePart;


    public Message(Conversation conversation, LocalDateTime date, User sender, MessageType messageType, String messagePart) {
        this.conversation = conversation;
        this.date = date;
        this.sender = sender;
        this.type = messageType;
        this.messagePart = messagePart;
    }

    public Integer getId() {
        return id;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  date + " - "
                + sender.getName() + ": "
                + messagePart
                ;
    }
}

