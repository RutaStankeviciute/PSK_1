package vu.lt.rest;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public abstract class CustomersRestServiceDecorator implements CustomersRestService {

    @Inject
    @Delegate
    @Any
    private CustomersRestService service;

    public void create(CustomerDto customerDto) {
        System.out.println(String.format("Customer %s created through REST service",
                customerDto.getName()));
        service.create(customerDto);
    }
}
