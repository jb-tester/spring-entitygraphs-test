package com.mytests.spring.jpa.entitygraphsTest.simple.data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * *
 * <p>Created by irina on 15.05.2021.</p>
 * <p>Project: spring-entitygraphs-test</p>
 * *
 */
@Entity
@Table(name = "customers")
@NamedEntityGraph(name = "customer.orders", attributeNodes = @NamedAttributeNode("orders"))

public class Customer {
    private Integer customerId;
    private String customerName;
    private String address;
    private Boolean vip;
    private List<Orders> orders;

    @Id
    @Column(name = "customer_id")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "vip")
    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    @OneToMany(mappedBy = "customer")
    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(customerName,
                customer.customerName) && Objects.equals(address, customer.address) && Objects.equals(vip,
                customer.vip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, address, vip);
    }

    @Override
    public String toString() {
        return 
                "customerId=" + customerId +
                ", customerName='" + customerName +
                "', address='" + address  +
                "', vip=" + vip +
                ", orders=" + orders +
                ' ';
    }
}
