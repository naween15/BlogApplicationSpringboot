package com.example.blogapplicationbackend.Service;

import com.example.blogapplicationbackend.Entity.User;
import com.example.blogapplicationbackend.Model.UserModel;

import java.util.List;

public interface UserService {

    public UserModel addUser(UserModel userModel);
    public UserModel updateUser(UserModel userModel,Long id);
    public void deleteUserById(Long id);
    public UserModel getUserById(Long id);
    public List<UserModel> getAllUsers();
}
