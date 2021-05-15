package com.mytests.spring.jpa.entitygraphsTest.simple.repositories;

import com.mytests.spring.jpa.entitygraphsTest.simple.data.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 **
 * <p>Created by irina on 15.05.2021.</p>
 * <p>Project: spring-entitygraphs-test</p>
 **
 */
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    
    // IDEA-269378 Spring Data: @org.springframework.data.jpa.repository.EntityGraph annotation support: provide reference to entity graph
    @EntityGraph("customer.orders")
    List<Customer> findByVip(Boolean vip); 
}
