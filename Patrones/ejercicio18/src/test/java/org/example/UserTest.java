package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user1;
    private User user2;

    @BeforeEach
    void setUp() {
        user1 = new User();
        user2 = new User();
    }

    @Test
    public void loginTest() {
        assertFalse(user1.isAuthenticated());
        user1.login("brian@gmail.com", "123");
        user2.login("toto@gmail.com", "123");
        assertTrue(user1.isAuthenticated());
        assertFalse(user2.isAuthenticated());
    }
}
