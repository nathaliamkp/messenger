package br.com.messager.dao;

import br.com.messager.model.PrivateConversation;
import br.com.messager.model.User;

import javax.persistence.EntityManager;

public class PrivateConversationDao {
    private EntityManager em;

    public PrivateConversationDao(EntityManager em) {
        this.em = em;
    }

    public void save(PrivateConversation privateConversation) {
        this.em.persist(privateConversation);
    }
}
