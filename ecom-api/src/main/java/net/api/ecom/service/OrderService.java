package net.api.ecom.service;

import jakarta.annotation.PostConstruct;
import net.api.ecom.entity.Order;
import net.api.ecom.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    public void init() {
        // Initize with dummy data
        orderRepository.save(new Order(LocalDate.now(), "Pending", "Customer1", "Product1", 100.0));
        orderRepository.save(new Order(LocalDate.now().minusDays(1), "Shipped", "Customer2", "Product2", 200.0));
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
