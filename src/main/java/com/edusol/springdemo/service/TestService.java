package com.edusol.springdemo.service;

import com.edusol.springdemo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TestService
{
        public List<Customer> getHelloWorld()
        {
            log.info("inside Service");
            List<Customer> e= new ArrayList<>();
            e.add(new Customer(1,"Umesh","Pune"));///assignment to add multiple user data
            e.add(new Customer(2,"Hello","Pune"));
            e.add(new Customer(3,"his","Pun"));
            return e;
        }
}
