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
import vu.lt.entities.Purchase;
import vu.lt.entities.Store;
import vu.lt.interceptors.LoggedInvocation;
import vu.lt.persistence.CustomersDAO;
import vu.lt.persistence.PurchasesDAO;
import vu.lt.persistence.StoresDAO;

@Model
public class PurchasesForCustomer implements Serializable {

    @Inject
    private CustomersDAO customersDAO;

    @Inject
    private PurchasesDAO purchasesDAO;

    @Getter @Setter
    private Customer customer;

    @Getter @Setter
    private Purchase purchaseToCreate = new Purchase();

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer customerId = Integer.parseInt(requestParameters.get("customerId"));
        this.customer = customersDAO.findOne(customerId);
    }
}
