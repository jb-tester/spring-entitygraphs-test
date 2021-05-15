package com.mytests.spring.jpa.entitygraphsTest.simple.repositories;

import com.mytests.spring.jpa.entitygraphsTest.simple.data.Orders;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 **
 * <p>Created by irina on 15.05.2021.</p>
 * <p>Project: spring-entitygraphs-test</p>
 **
 */
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
    
    @EntityGraph(attributePaths = {"customer"})
     List<Orders> findByUrgent(Boolean urgent);
}
