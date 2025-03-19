package ar.edu.unlp.info.oo1.ejercicio_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TweeterTest {
    private Tweeter tweeter;

    @BeforeEach
    void setup() {
        tweeter = new Tweeter();
    }

    @Test
    public void tweeterCreationTest() {
        assertEquals(0, tweeter.getUsers().size());
    }

    @Test
    public void createUserTest() {
        tweeter.createUser("Joel");

        assertEquals(1, tweeter.getUsers().size());
    }

    @Test
    public void deleteUser() {
        User joel = tweeter.createUser("Joel");

        //usuario inexistente (externo a tweeter)
        User armando = new User("Armando");

        tweeter.deleteUser(joel);
        tweeter.deleteUser(armando); // no ocurre nada

        assertEquals(0, tweeter.getUsers().size());
    }

    @Test
    public void deleteUser_deletedUserHasNoTweets() {
        User sergio = tweeter.createUser("Sergio");
        Tweet tweet = sergio.createTweet("Un tweet de Sergio");
        assertEquals(1, sergio.getTweets().size());
        assertEquals("Sergio", tweet.getOwner());

        tweeter.deleteUser(sergio);
        assertEquals(0, sergio.getTweets().size());
        assertEquals("Deleted", tweet.getOwner());
    }
}
