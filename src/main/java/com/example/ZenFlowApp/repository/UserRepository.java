package com.example.ZenFlowApp.repository;

import com.example.ZenFlowApp.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}
