package com.example.blogapplicationbackend.Controller;

import com.example.blogapplicationbackend.Model.UserModel;
import com.example.blogapplicationbackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
// post -create user
    @PostMapping("/add")
    public ResponseEntity<UserModel> createUser(@Valid @RequestBody UserModel userModel){
        UserModel userCreated= userService.addUser(userModel);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }




//    up -update user
    @PutMapping("/{id}")
    public ResponseEntity<UserModel> updateUser(@Valid @PathVariable("id")long id, UserModel newUSer){
        return ResponseEntity.ok(userService.updateUser(newUSer,id));
    }
//    delete -delete user

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id")long id){
        userService.deleteUserById(id);
        return ResponseEntity.ok("user was deleted");
    }
//    get -get user

    @GetMapping("/getall")
    public ResponseEntity<List<UserModel>> getAllUsers(){
        List<UserModel> userModel=userService.getAllUsers();
        return new ResponseEntity<>(userModel,HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUserByiId(@PathVariable("id")long id){
        UserModel userModel=userService.getUserById(id);
        return new ResponseEntity<>(userModel,HttpStatus.FOUND);
    }
}
