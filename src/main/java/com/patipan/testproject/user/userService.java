package com.patipan.testproject.user;

import com.patipan.testproject.config.baseException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    private final userRepository repo;

    public userService(userRepository repo) {
        this.repo = repo;
    }

    public void createUser(userModel request) throws baseException {
        if (request.getName() == null) {
            throw userException.nameNull();
        }
        repo.save(request);
    }

    public List<userModel> findAll() {
        return repo.findAll();
    }
}
