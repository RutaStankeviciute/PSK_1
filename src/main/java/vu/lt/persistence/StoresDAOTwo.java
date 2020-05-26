package vu.lt.persistence;

import vu.lt.entities.Store;
import vu.lt.interceptors.LoggedInvocation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Alternative
@ApplicationScoped
public class StoresDAOTwo implements StoresDAO{

    @Inject
    private EntityManager em;

    public List<Store> loadAll() {
        System.out.println("I am Two");
        return em.createNamedQuery("Store.findAll", Store.class).getResultList();
    }

    public void setEm(EntityManager em) {
        System.out.println("I am Two");
        this.em = em;
    }

    @LoggedInvocation
    public void persist(Store store){
        System.out.println("I am Two");
        this.em.persist(store);
    }

    public Store findOne(Integer id) {
        System.out.println("I am Two");
        return em.find(Store.class, id);
    }
}
