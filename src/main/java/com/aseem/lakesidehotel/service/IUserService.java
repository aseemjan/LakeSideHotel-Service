package com.aseem.lakesidehotel.service;

import java.util.*;

import com.aseem.lakesidehotel.model.User;


public interface IUserService {
    User registerUser(User user);

    List<User> getUsers();

    void deleteUser(String email);

    User getUser(String email);

}
