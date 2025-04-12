package com.restaurant.service;

import com.restaurant.dto.OrderResponse;
import com.restaurant.model.Orders;
import com.restaurant.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository ordersRepository;

    public List<OrderResponse> getAllOrders() {
        return ordersRepository.findAll().stream()
                .map(order -> new OrderResponse(order.getOrderId(), order.getCustomerName(), order.getTotalPrice()))
                .collect(Collectors.toList());
    }

    public OrderResponse getOrderById(String id) {
        Orders order = ordersRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        return new OrderResponse(order.getOrderId(), order.getCustomerName(), order.getTotalPrice());
    }
}
