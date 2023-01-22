package com.customerservice.service.impl;

import com.customerservice.model.Customer;
import com.customerservice.repo.CustomerRepo;
import com.customerservice.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepo repo;

    @Override
    public Customer insert(Customer customer){

        return repo.save(customer);
    }

    @Override
    public List<Customer> list() {
        return repo.findAll();
    }
}
