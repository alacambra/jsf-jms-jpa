package poolingpeople.prototype.controller;

import poolingpeople.prototype.model.User;

import javax.ejb.BeforeCompletion;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.lang.model.element.Name;
import javax.persistence.*;

/**
 * Created by alacambra on 18.11.14.
 */
@ManagedBean(name = "userController")
public class UserController {

    private User current;
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prototype");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

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
        entityManager.persist(current);
        current = null;
    }
}
