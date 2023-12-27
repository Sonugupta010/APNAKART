package com.ApnaKart.service;

import java.util.List;

import com.ApnaKart.exception.ProductException;
import com.ApnaKart.model.Review;
import com.ApnaKart.model.User;
import com.ApnaKart.request.ReviewRequest;

public interface ReviewService {
	
	public Review createReview(ReviewRequest req, User user) throws ProductException;
	public List<Review> getAllReview(Long productId);

}
