package net.api.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private String status;
    private String customer;
    private String product;
    private Double revenue;

    public Order(LocalDate now, String pending, String customer1, String product1, double v) {
    }

    public Order() {

    }

    // Getters and setters

}
