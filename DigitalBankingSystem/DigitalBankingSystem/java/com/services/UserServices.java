package com.services;

import org.springframework.stereotype.Service;

import com.modal.User;

@Service
public interface UserServices {

	void saveUser(User user);

}
