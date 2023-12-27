package com.ApnaKart.service;

import com.ApnaKart.exception.UserException;
import com.ApnaKart.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	

}