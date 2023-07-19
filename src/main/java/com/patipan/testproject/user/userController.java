package com.patipan.testproject.user;

import com.patipan.testproject.config.baseException;
import com.patipan.testproject.config.responseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    private final userService userService;

    public userController(userService service, com.patipan.testproject.user.userService userService, responseObject res) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<responseObject> createUser(@RequestBody userModel request) throws baseException {
        userService.createUser(request);
        responseObject res = new responseObject();
        res.setStatus(201);
        res.setMessage("Created");
        res.setData(new ArrayList());
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<responseObject> findAll() throws baseException {
        responseObject res = new responseObject();
        res.setStatus(200);
        res.setMessage("Completed");
        res.setData(new ArrayList(userService.findAll()));
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
