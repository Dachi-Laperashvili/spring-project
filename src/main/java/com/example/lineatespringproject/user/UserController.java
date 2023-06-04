package com.example.lineatespringproject.user;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/fill")
    public String fillUsers(){
        userService.fillUsers();
        return "Dummy users filled!";
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }
}
