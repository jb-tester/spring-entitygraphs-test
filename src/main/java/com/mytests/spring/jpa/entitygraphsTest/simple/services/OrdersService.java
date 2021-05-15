package com.mytests.spring.jpa.entitygraphsTest.simple.services;

import com.mytests.spring.jpa.entitygraphsTest.simple.data.Orders;
import com.mytests.spring.jpa.entitygraphsTest.simple.repositories.OrdersRepo;
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
public class OrdersService {


    @Autowired
    private OrdersRepo ordersRepo;
    
    public void displayUrgentOrders(){
        List<Orders> orders = ordersRepo.findByUrgent(true);
        System.out.println("==== urgent orders: ====");
        for (Orders order : orders) {
            System.out.println(order);
        }
    }
}
