package br.com.messager.model;

public class ConversationAdministrator {

    private Integer Id;
    private User user;
    private Conversation conversation;

    public Integer getId() {
        return Id;
    }

    public User getUser() {
        return user;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public ConversationAdministrator(User user, Conversation conversation) {
        this.user = user;
        this.conversation = conversation;
    }





}
