package com.edusol.springdemo.controller;

import com.edusol.springdemo.dto.Customer;
import com.edusol.springdemo.repository.TestRepository;
import com.edusol.springdemo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edu")
@Slf4j
public class TestController {
    @Autowired
    private TestService testService;


    @GetMapping("/get")
    public List<Customer> helloWorld() {
        log.info("Inside Controller");
        return testService.getHelloWorld();
    }
    @PostMapping("/submit")
    public void addcustomer(@RequestBody Customer customer) {
        testService.addCustomerService(customer);
    }


    @DeleteMapping("delete/{id}")
    public String deleteCustomer(@PathVariable String id)
    {
        testService.deleteCustomer(id);
        return " DELETE "+id;

    }

}
