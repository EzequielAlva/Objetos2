package org.example;

import java.util.*;

public class UserDatabase {
    private Map<String, String> data;

    public UserDatabase() {
        this.data = new HashMap<>();
        this.data.put("brian@gmail.com","123");
        this.data.put("ezequiel@gmail.com","321");
    }

    public boolean findUser(String email, String password) {
        Object response = data.get(email);
        return response != null && response.equals(password);
    }
}
