package vu.lt.usecases;

import vu.lt.interceptors.LoggedInvocation;
import vu.lt.services.PersonalCodeGenerator;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SessionScoped
@Named
public class GenerateCustomerPersonalCode implements Serializable {

    @Inject
    PersonalCodeGenerator personalCodeGenerator;

    private Future<Integer> personalCodeGenerationTask = null;

    @LoggedInvocation
    public String generateNewPersonalCode() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        personalCodeGenerationTask = personalCodeGenerator.generatePersonalCode();
        return  "/customerDetails.xhtml?faces-redirect=true&customerId=" + requestParameters.get("customerId");
    }

    public boolean isPersonalCodeGenerationRunning() {
        return personalCodeGenerationTask != null && !personalCodeGenerationTask.isDone();
    }

    public String getPersonalCodeGenerationStatus() throws ExecutionException, InterruptedException {
        if (personalCodeGenerationTask == null) {
            return null;
        } else if (isPersonalCodeGenerationRunning()) {
            return "Personal Code generation in progress";
        }
        return "Suggested personal code: " + personalCodeGenerationTask.get();
    }
}
