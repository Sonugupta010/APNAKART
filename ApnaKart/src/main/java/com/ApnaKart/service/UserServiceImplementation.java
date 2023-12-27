package com.ApnaKart.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ApnaKart.config.JwtTokenProvider;
import com.ApnaKart.exception.UserException;
import com.ApnaKart.model.User;
import com.ApnaKart.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	private UserRepository userRepository;
	private JwtTokenProvider jwtTokenProvider;
	
	public UserServiceImplementation(UserRepository userRepository,JwtTokenProvider jwtTokenProvider) {
		this.userRepository=userRepository;
		this.jwtTokenProvider=jwtTokenProvider;
	}

	@Override
	public User findUserById(Long userId) throws UserException {
		Optional<User>user=userRepository.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		throw new UserException("user not found with id :" +userId);
		
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email=jwtTokenProvider.getEmailFromJwtToken(jwt);
		
		User user=userRepository.findByEmail(email);
		
		if(user==null) {
			throw new UserException("user not found with email:" +email);
		}
		return user;
	}

}
