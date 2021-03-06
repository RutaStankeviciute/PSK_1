package vu.lt.persistence;

import vu.lt.entities.Customer;
import vu.lt.entities.Purchase;
import vu.lt.interceptors.LoggedInvocation;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class CustomersDAO {

    @Inject
    private EntityManager em;

    @LoggedInvocation
    public void persist(Customer customer){

        this.em.persist(customer);
    }

    public Customer findOne(Integer id){

        return em.find(Customer.class, id);
    }

    public Customer update(Customer customer){

        return em.merge(customer);
    }
}