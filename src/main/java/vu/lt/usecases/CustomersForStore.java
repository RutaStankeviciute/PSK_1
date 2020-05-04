package vu.lt.usecases;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import vu.lt.entities.Customer;
import vu.lt.entities.Store;
import vu.lt.persistence.CustomersDAO;
import vu.lt.persistence.StoresDAO;

@Model
public class CustomersForStore implements Serializable {

    @Inject
    private StoresDAO storesDAO;

    @Inject
    private CustomersDAO customersDAO;

    @Getter @Setter
    private Store store;

    @Getter @Setter
    private Customer customerToCreate = new Customer();

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer storeId = Integer.parseInt(requestParameters.get("storeId"));
        this.store = storesDAO.findOne(storeId);
    }

    @Transactional
    public String createCustomer() {
        customerToCreate.setStore(this.store);
        customersDAO.persist(customerToCreate);
        return "customers?faces-redirect=true&storeId=" + this.store.getId();
    }
}