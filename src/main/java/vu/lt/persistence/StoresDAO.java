package vu.lt.persistence;

import vu.lt.entities.Store;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class StoresDAO {

    @Inject
    private EntityManager em;

    public List<Store> loadAll() {
        return em.createNamedQuery("Store.findAll", Store.class).getResultList();
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void persist(Store store){
        this.em.persist(store);
    }

    public Store findOne(Integer id) {
        return em.find(Store.class, id);
    }
}