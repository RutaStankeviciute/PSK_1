package vu.lt.usecases;

import lombok.Getter;
import lombok.Setter;
import vu.lt.entities.Store;
import vu.lt.persistence.StoresDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Stores {

    @Inject
    private StoresDAO storesDAO;

    @Getter @Setter
    private Store storeToCreate = new Store();

    @Getter
    private List<Store> allStores;

    @PostConstruct
    public void init(){
        loadAllStores();
    }

    @Transactional
    public String createStore(){
        this.storesDAO.persist(storeToCreate);
        return "index?faces-redirect=true";
    }

    private void loadAllStores(){
        this.allStores = storesDAO.loadAll();
    }
}