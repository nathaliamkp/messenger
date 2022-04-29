package br.com.messager.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {

    private  static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("messager");


    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
