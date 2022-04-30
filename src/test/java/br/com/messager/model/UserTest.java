package br.com.messager.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UserTest {

    @Test
    void shouldCreateAPrivateConversation(){
        User u1 = new User("Luis", "1111111");
        User u2 = new User("Laura", "222222");

        PrivateConversation privateConversation = (PrivateConversation) u1.createPrivateConversation(u2);

        assertEquals(u1, privateConversation.getUserOwner());

    }

    @Test
    void shouldCreateAMessage(){
        User u1 = new User("Luis", "1111111");
        User u2 = new User("Laura", "222222");

        Conversation conversation = u1.createPrivateConversation(u2);

        Message message = u1.sendMessage(conversation, "Olá tudo bem?", "AUDIO");

        assertEquals();

    }


}