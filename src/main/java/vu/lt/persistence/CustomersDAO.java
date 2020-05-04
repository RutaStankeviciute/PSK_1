package vu.lt.persistence;

import vu.lt.entities.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class CustomersDAO {

    @Inject
    private EntityManager em;

    public void persist(Customer customer){
        this.em.persist(customer);
    }
}