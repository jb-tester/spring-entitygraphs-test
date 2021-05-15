package com.mytests.spring.jpa.entitygraphsTest.simple.data;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 15.05.2021.</p>
 * <p>Project: spring-entitygraphs-test</p>
 * *
 */
@Entity
public class Orders {
    private Integer orderId;
    private Boolean urgent;
    private Customer customer;

    @Id
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "urgent")
    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerByCustomerId) {
        this.customer = customerByCustomerId;
    }

    @Override
    public String toString() {
        return 
                "orderId=" + orderId + ", urgent="+ urgent+", customer="+customer.getCustomerName(); 
                
    }
}
