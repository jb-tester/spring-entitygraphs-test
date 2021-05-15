package com.mytests.spring.jpa.entitygraphsTest.simple.services;

import com.mytests.spring.jpa.entitygraphsTest.simple.data.Customer;
import com.mytests.spring.jpa.entitygraphsTest.simple.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 **
 * <p>Created by irina on 15.05.2021.</p>
 * <p>Project: spring-entitygraphs-test</p>
 **
 */
@Component
public class CustomerService {


    @Autowired
    private CustomerRepo customerRepo;
    
    public void displayVipCustomers() {
        List<Customer> vips =  customerRepo.findByVip(true);
        System.out.println("======== vip customers: =========");
        for (Customer vip : vips) {
            System.out.println(vip);
        }
    }
}
