package com.ApnaKart.service;

import java.util.List;

import com.ApnaKart.exception.ProductException;
import com.ApnaKart.model.Rating;
import com.ApnaKart.model.User;
import com.ApnaKart.request.RatingRequest;

public interface RatingService {
	
	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating>getProductsRating(Long productId);

}
