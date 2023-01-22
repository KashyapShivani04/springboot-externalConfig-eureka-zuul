package com.customerservice.controller;

import com.customerservice.model.Customer;
import com.customerservice.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/customers", produces = MediaType.APPLICATION_JSON_VALUE)
@RefreshScope
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Value("${server.url:Unable to connect to config server}")
    //@Value("${server.url}")
    private String url;

    /*@GetMapping
    public List<Customer> customerList() {
        Customer c1 = Customer.builder()
                .id("1")
                .name("john doe")
                .company("acme")
                .dob(LocalDate.now().minusYears(28)).build();
        Customer c2 = Customer.builder()
                .id("2")
                .name("jane doe")
                .company("acme")
                .dob(LocalDate.now().minusYears(24)).build();
        List<Customer> result = new ArrayList<>();
        result.add(c1);
        result.add(c2);
        return result;
    }*/

    @RequestMapping("/server/url")
    String getURL() {
        log.info("Value of url from Config Server: "+this.url);
        return this.url;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Customer>> list(){

        //log.info("Value of title from Config Server: "+title);
        return ResponseEntity.ok(customerService.list());
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Customer> insert(@RequestBody Customer customer){

        return ResponseEntity.ok(customerService.insert(customer));
    }
}