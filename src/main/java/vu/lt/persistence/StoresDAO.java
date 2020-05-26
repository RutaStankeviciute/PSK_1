package vu.lt.persistence;

import vu.lt.entities.Store;
import vu.lt.interceptors.LoggedInvocation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface StoresDAO {

    List<Store> loadAll();

    void setEm(EntityManager em);

    void persist(Store store);

    Store findOne(Integer id);
}