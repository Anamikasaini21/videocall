package com.alibou.videocall.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class UserService {

    private static final List<User> USERS_LIST = new ArrayList<>();

    public void register(User user) {
        user.setStatus("online");
        USERS_LIST.add(user);
    }

    public User login(User user) {
        var userIndex = IntStream.range(0, USERS_LIST.size())
                .filter(i -> USERS_LIST.get(i).getEmail().equals(user.getEmail()))
                .findAny()
                .orElseThrow(() -> new RuntimeException("User not found"));
        var cUser = USERS_LIST.get(userIndex);
        if (!cUser.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Password incorrect");
        }
        cUser.setStatus("online");
        return cUser;
        
        //connecteduser ka password incorrect h to password incorrect show kar do otherwise password correct to user ko online dikha do and us connectd user ko return kar do
    }

    public void logout(Object object) {
        var userIndex = IntStream.range(0, USERS_LIST.size())
                .filter(i -> USERS_LIST.get(i).getEmail().equals(object))
                .findAny()
                .orElseThrow(() -> new RuntimeException("User not found"));
        USERS_LIST.get(userIndex).setStatus("offline");
    }

    public List<User> findAll() {
        return USERS_LIST;
    }
}