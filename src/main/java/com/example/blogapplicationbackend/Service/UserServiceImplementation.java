package com.example.blogapplicationbackend.Service;

import com.example.blogapplicationbackend.Entity.User;
import com.example.blogapplicationbackend.Exceptions.ResourceNotFoundException;
import com.example.blogapplicationbackend.Model.UserModel;
import com.example.blogapplicationbackend.Repository.USerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    private USerRepository repository;
    @Override
    public UserModel addUser(UserModel userModel) {
        User user= repository.save(this.usermodeltouser(userModel));
        return this.usertousermodel(user);
    }

    @Override
    public UserModel updateUser(UserModel userModel, Long id) {
       User user= repository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","id",id));
       user.setPassword(userModel.getPassword());
       user.setAbout(userModel.getPassword());
       user.setName(userModel.getName());
       user.setEmail(userModel.getEmail());
       repository.save(user);
       return this.usertousermodel(user);
    }

    @Override
    public void deleteUserById(Long id) {
        User user=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("USER","id",id));
        repository.delete(user);
    }

    @Override
    public UserModel getUserById(Long id) {
        User user= repository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","id",id));
        return usertousermodel(user);
    }

    @Override
    public List<UserModel> getAllUsers() {
        List<User> users=repository.findAll();
        List<UserModel> userModels=users.stream().map(user->this.usertousermodel(user)).collect(Collectors.toList());
        return userModels;

    }

    public User usermodeltouser(UserModel model){
        User user=new User();
        user.setName(model.getName());
        user.setAbout(model.getAbout());
        user.setEmail(model.getEmail());
        user.setPassword(model.getPassword());
        return user;
    }
    public UserModel usertousermodel(User model){
        UserModel user=new UserModel();
        user.setName(model.getName());
        user.setAbout(model.getAbout());
        user.setEmail(model.getEmail());
        user.setPassword(model.getPassword());
        user.setId(model.getUserId());
        return user;
    }
}
