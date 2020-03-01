package com.edusol.springdemo.service;

import com.edusol.springdemo.dto.Customer;
import com.edusol.springdemo.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TestService
{   @Autowired
    private TestRepository testRepository;
        public List<Customer> getHelloWorld()
        {
            log.info("inside Service");
            log.info("Gettting Customer data");
            return testRepository.getCustomers();


        }
        public void addCustomerService(Customer customer){

            testRepository.addCustomer(customer);
        }
}
