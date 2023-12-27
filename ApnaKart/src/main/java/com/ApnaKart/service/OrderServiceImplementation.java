package com.ApnaKart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApnaKart.exception.OrderException;
import com.ApnaKart.model.Address;
import com.ApnaKart.model.Order;
import com.ApnaKart.model.User;
import com.ApnaKart.repository.CartRepository;

@Service
public class OrderServiceImplementation implements OrderService {
	
	private CartRepository cartRepository;
	
	private CartService cartService;
	
	private ProductService productService;
	
	
	public OrderServiceImplementation(CartRepository cartRepository,
			CartService cartService,
			ProductService productService) {
		this.cartRepository=cartRepository;
		this.cartService=cartService;
		this.productService=productService;

	}

	@Override
	public Order createOrder(User user, Address shippingAdress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderById(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> usersOrderHistory(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order placedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order confirmedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order shippingOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deliveryOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order canceledOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		
	}
	

}
