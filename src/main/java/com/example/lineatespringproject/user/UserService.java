package com.example.lineatespringproject.user;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void fillUsers(){
        userRepository.addDummyUsers(new User("Joe"));
        userRepository.addDummyUsers(new User("Alex"));
        userRepository.addDummyUsers(new User("George"));
    }
    public List<User> getAll(){
        return userRepository.getAll();
    }
}
