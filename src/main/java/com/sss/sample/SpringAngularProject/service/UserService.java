package com.sss.sample.SpringAngularProject.service;


import java.util.List;

import com.sss.sample.SpringAngularProject.model.User;

public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
}