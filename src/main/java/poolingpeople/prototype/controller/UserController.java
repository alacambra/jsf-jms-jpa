package poolingpeople.prototype.controller;

import poolingpeople.prototype.jms.NotificationConsumer;
import poolingpeople.prototype.model.User;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.util.Collection;

/**
 * Created by alacambra on 18.11.14.
 */
@ManagedBean(name = "userController")
public class UserController {

    private User current;
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prototype");
    private EntityManager em = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = em.getTransaction();

    public String getText(){
        return "my test";
    }

    public User getCurrent() {

        if(current == null)
            current = new User();

        return current;
    }

    public void saveUser(){
        System.out.println(current.getName() + current.toString());
        entityTransaction.begin();
        em.persist(current);
        entityTransaction.commit();
        current = null;
    }

    public Collection<User> getUsers(){
        NotificationConsumer notificationConsumer = new NotificationConsumer();
        notificationConsumer.consumeNotification();

        return em.createQuery("from User").getResultList();
    }

}
