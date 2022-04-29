package br.com.messager.model;

import java.util.Calendar;

public class Message {

    private Integer id;
    private Conversation conversation;
    private Calendar date;
    private MessageType type;
    private User sender;
    private String messagePart;


    public Message(Conversation conversation, Calendar date, User sender, MessageType messageType, String messagePart) {
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

    public Calendar getDate() {
        return date;
    }
}

