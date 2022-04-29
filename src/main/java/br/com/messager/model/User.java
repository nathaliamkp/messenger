package br.com.messager.model;

import java.util.Calendar;

public class User {

    private Integer id;
    private String name;
    private String cellphone;

    public User(String name, String cellphone) {
        this.name = name;
        this.cellphone = cellphone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public Conversation createPrivateConversation(User guest){
        PrivateConversation privateConversation = new PrivateConversation(this, Calendar.getInstance(), guest);
        return privateConversation;
    }

    public Message sendMessage(Conversation conversation, String messagePart, String type){
        MessageType messageType = MessageType.valueOf(type);
        Message message = conversation.createMessage(this, messagePart, messageType);
        return message;
    }

}
