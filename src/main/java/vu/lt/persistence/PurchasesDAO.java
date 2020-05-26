package vu.lt.persistence;

import vu.lt.entities.Purchase;
import vu.lt.entities.Store;
import vu.lt.interceptors.LoggedInvocation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class PurchasesDAO {

    @Inject
    private EntityManager em;

    @LoggedInvocation
    public void persist(Purchase purchase){
        this.em.persist(purchase);
    }
}
