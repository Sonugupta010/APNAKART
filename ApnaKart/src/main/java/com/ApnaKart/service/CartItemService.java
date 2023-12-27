package com.ApnaKart.service;

import com.ApnaKart.exception.CartItemException;
import com.ApnaKart.exception.UserException;
import com.ApnaKart.model.Cart;
import com.ApnaKart.model.CartItem;
import com.ApnaKart.model.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);
	
	public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	

}
