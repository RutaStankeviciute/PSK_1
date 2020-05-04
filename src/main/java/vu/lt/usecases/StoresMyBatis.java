package vu.lt.usecases;

import lombok.Getter;
import lombok.Setter;
import vu.lt.mybatis.dao.StoreMapper;
import vu.lt.mybatis.model.Store;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class StoresMyBatis {
    @Inject
    private StoreMapper storeMapper;

    @Getter
    private List<Store> allStores;

    @Getter @Setter
    private Store storeToCreate = new Store();

    @PostConstruct
    public void init() {
        this.loadAllStores();
    }

    private void loadAllStores() {
        this.allStores = storeMapper.selectAll();
    }

    @Transactional
    public String createStore() {
        storeMapper.insert(storeToCreate);
        return "/myBatis/stores?faces-redirect=true";
    }
}