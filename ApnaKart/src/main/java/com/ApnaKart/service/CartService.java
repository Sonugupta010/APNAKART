package com.ApnaKart.service;

import com.ApnaKart.exception.ProductException;
import com.ApnaKart.model.Cart;
import com.ApnaKart.model.User;
import com.ApnaKart.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
