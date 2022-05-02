package br.com.messager.model;

import java.util.Calendar;
import java.util.List;

public class PrivateConversation extends Conversation {
    private User guest;

    public PrivateConversation(User userOwner, Calendar createDate, User guest) {
        super(userOwner, createDate);
        this.guest = guest;
    }

    @Override
    protected List<Message> getMessages(Conversation conversation) {

        return null;
    }
}