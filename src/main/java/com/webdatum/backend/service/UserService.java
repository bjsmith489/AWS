package com.webdatum.backend.service;

import com.webdatum.backend.model.User;
import com.webdatum.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        return repo.save(user);
    }

    public Optional<User> login(String email, String password) {
        return repo.findByEmail(email)
                .filter(u -> u.getPassword().equals(password));
    }

    public Optional<User> findByEmail(String email) {
        return repo.findByEmail(email);
    }
}