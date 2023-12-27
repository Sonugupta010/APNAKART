package com.ApnaKart.service;

import java.util.List;

import com.ApnaKart.exception.OrderException;
import com.ApnaKart.model.Address;
import com.ApnaKart.model.Order;
import com.ApnaKart.model.User;

public interface OrderService {
	
	public Order createOrder(User user, Address shippingAdress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public Order placedOrder(Long orderId) throws OrderException;
	
	public Order confirmedOrder(Long orderId) throws OrderException;
	
	public Order shippingOrder(Long orderId) throws OrderException;
	
	public Order deliveryOrder(Long orderId) throws OrderException;
	
	public Order canceledOrder(Long orderId) throws OrderException;
	
	public List<Order>getAllOrders();
	
	public void deleteOrder(Long orderId) throws OrderException;
	
	

}
