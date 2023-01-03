package com.LeoDominici.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeoDominici.domain.User;
import com.LeoDominici.repository.UserRepository;

@Service
public class UserService {
	
@Autowired
private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
		
	}
}
