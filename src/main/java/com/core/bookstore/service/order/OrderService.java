package com.core.bookstore.service.order;

import com.core.bookstore.dao.model.Order;
import com.core.bookstore.dao.model.User;
import com.core.bookstore.dao.repository.OrderRepository;
import jakarta.annotation.Resource;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private EntityManager entityManager;

    public void createOrder() {
        Order newOrder = Order.builder()
                .name("firstOrder")
                .user(entityManager.getReference(User.class, 1))
                .build();

        orderRepository.save(newOrder);
    }

    public void getOrderDetails(String orderName) {
        Optional<Order> order = orderRepository.findByName(orderName);

        if (order.isEmpty()) {
            throw new IllegalArgumentException("no Order Found!");
        }

        System.out.println(order.get().getUser().getEmail());
    }
}
