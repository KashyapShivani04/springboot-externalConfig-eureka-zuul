package com.customerservice.service;

import com.customerservice.model.Customer;

import java.util.List;

public interface ICustomerService {

    Customer insert(Customer customer);

    List<Customer> list();
}
