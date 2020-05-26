package vu.lt.usecases;

import lombok.Getter;
import lombok.Setter;
import vu.lt.entities.Customer;
import vu.lt.interceptors.LoggedInvocation;
import vu.lt.persistence.CustomersDAO;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@ViewScoped
@Named
@Getter @Setter
public class UpdateCustomer implements Serializable {

    private Customer customer;

    @Inject
    private CustomersDAO customersDAO;

    @PostConstruct
    private void init() {
        System.out.println("UpdateCustomer INIT CALLED");
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer customerId = Integer.parseInt(requestParameters.get("customerId"));
        this.customer = customersDAO.findOne(customerId);
    }

    @Transactional
    @LoggedInvocation
    public String updateCustomerPersonalCode() {
        try{
            customersDAO.update(this.customer);
        } catch (OptimisticLockException e) {
            return "/customerDetails.xhtml?faces-redirect=true&customerId=" + this.customer.getId() + "&error=optimistic-lock-exception";
        }
        return "customers.xhtml?storeId=" + this.customer.getStore().getId() + "&faces-redirect=true";
    }
}
