package br.com.messager.dao;

import br.com.messager.model.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDao {

    private EntityManager em;

    public UserDao(EntityManager em) {
        this.em = em;
    }

    public void save(User user) {
        this.em.persist(user);
    }

    public User getById(Integer id){
        return em.find(User.class, id);
    }

    public List<User> getByName(String nome){
        String jpql = "SELECT p FROM User p WHERE p.name = :name";
        return em.createQuery(jpql, User.class)
                .setParameter("name", nome)
                .getResultList();
    }


}
