package br.com.messager.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@Entity
public class MessageDao {

    private EntityManager em;

    public MessageDao(EntityManager em) {
        this.em = em;
    }

}
