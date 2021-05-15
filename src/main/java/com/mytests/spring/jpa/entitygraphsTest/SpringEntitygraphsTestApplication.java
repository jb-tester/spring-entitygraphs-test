package com.mytests.spring.jpa.entitygraphsTest;

import com.mytests.spring.jpa.entitygraphsTest.simple.services.CustomerService;
import com.mytests.spring.jpa.entitygraphsTest.simple.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEntitygraphsTestApplication implements CommandLineRunner {

    

    public static void main(String[] args) {
        SpringApplication.run(SpringEntitygraphsTestApplication.class, args);
    }
   @Autowired
    CustomerService customerService;
    @Autowired
    private OrdersService ordersService;
    @Override
    public void run(String... args) throws Exception {
        customerService.displayVipCustomers();
        ordersService.displayUrgentOrders();
    }
}
