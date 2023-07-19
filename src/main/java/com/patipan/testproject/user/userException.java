package com.patipan.testproject.user;

import com.patipan.testproject.config.baseException;

public class userException extends baseException {

    public userException (String message) {
        super (message);
    }

    public static userException nameNull() {
        return new userException("Missing parameter 'name'");
    }
}
