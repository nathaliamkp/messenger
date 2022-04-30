package br.com.messager;

import br.com.messager.model.Conversation;
import br.com.messager.model.User;

public class Teste {

    public static void main(String[] args) {

        User u1 = new User("Morgana", "11111111111");
        User u2 = new User("Minduim", "22222222222");

        Conversation conversation = u1.createPrivateConversation(u2);

        System.out.println(u1.sendMessage(conversation, "Olá", "TEXT"));

    }

}
