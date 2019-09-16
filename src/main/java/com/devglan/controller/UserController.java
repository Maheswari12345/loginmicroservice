package com.devglan.controller;


import com.devglan.model.ApiResponse;
import com.devglan.model.User;
import com.devglan.model.UserDto;
import com.devglan.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
 

    
   
    
    @GetMapping("/signup")
    public ApiResponse <User> saveUser(@RequestBody User user){
    	return new ApiResponse<>(HttpStatus.OK.value(),"stockexchange list fetched successfully", userService.save(user));
    }
    
    
    
}
