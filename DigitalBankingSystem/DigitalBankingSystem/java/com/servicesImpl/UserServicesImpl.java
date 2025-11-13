package com.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.UserDao;
import com.modal.User;
import com.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

    private final UserDao userDao; 

    @Autowired
    public UserServicesImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}
