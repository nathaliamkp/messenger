package br.com.messager.model;

import java.util.Calendar;

public class PrivateConversation extends Conversation {

    private User guest;

    public PrivateConversation(User userOwner, Calendar createDate, User guest) {
        super(userOwner, createDate);
        this.guest = guest;
    }






}