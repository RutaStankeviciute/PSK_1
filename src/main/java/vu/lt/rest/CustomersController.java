package vu.lt.rest;

import lombok.*;
import vu.lt.entities.Customer;
import vu.lt.persistence.CustomersDAO;
import vu.lt.rest.CustomerDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/customers")
public class CustomersController {

    @Inject
    @Setter @Getter
    private CustomersDAO customersDAO;

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") final Integer id) {
        Customer customer = customersDAO.findOne(id);
        if (customer == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        CustomerDto customerDto = new CustomerDto();
        customerDto.setName(customer.getName());
        customerDto.setPersonalCode(customer.getPersonalCode());
        customerDto.setStoreName(customer.getStore().getName());

        return Response.ok(customerDto).build();
    }

    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@PathParam("id") final Integer customerId, CustomerDto customerData) {
        try {
            Customer existingCustomer = customersDAO.findOne(customerId);
            if (existingCustomer == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            existingCustomer.setName(customerData.getName());
            existingCustomer.setPersonalCode(customerData.getPersonalCode());
            customersDAO.update(existingCustomer);
            return Response.ok().build();
        } catch (OptimisticLockException ole) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }

    @Path("/{id}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(@PathParam("id") final Integer customerId, CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customer.setPersonalCode(customerDto.getPersonalCode());
        customersDAO.persist(customer);
        return Response.ok().build();
    }
}
