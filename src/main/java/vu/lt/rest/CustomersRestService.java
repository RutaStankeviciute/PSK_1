package vu.lt.rest;

import vu.lt.entities.Customer;

public interface CustomersRestService {

    Customer find(Integer customerId);

    void create(CustomerDto customerDto);

    void update(Integer customerId, CustomerDto customerDto);
}
