package ar.edu.unlp.info.oo1.ejercicio_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;
    private User otherUser;

    @BeforeEach
    void setUp() {
        user = new User("Brian");
        otherUser = new User("Joel");
    }

    @Test
    public void userCreationTest() {
        assertEquals("Brian", user.getScreenName());
        assertEquals(0, user.getTweets().size());
    }

    @Test
    public void createTweetTest() {
        user.createTweet("tweet de User");
        // tweet con 300 caracteres
        Tweet otherTweet = user.createTweet("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec.");

        assertEquals(1, user.getTweets().size()); //expected , actual
        assertNull(otherTweet);
    }

    @Test
    public void createRetweetTest() {
        Tweet tweet = user.createTweet("tweet de User");
        Retweet retweet = otherUser.createRetweet(tweet);

        assertEquals(tweet, retweet.getTweet());
    }

    @Test
    public void deleteTweetListTest() {
        Tweet tweet = otherUser.createTweet("Un tweet de OtherUser");
        user.createTweet("Mi primer tweet");
        user.createRetweet(tweet);

        user.deleteTweetList();
        assertEquals(0, user.getTweets().size());
    }

    @Test
    public void deleteTweetList_retweetHasNoTweetTest() {
        Tweet tweet = user.createTweet("tweet de User");
        Retweet retweet = otherUser.createRetweet(tweet);
        user.deleteTweetList();

        assertNull(retweet.getTweet());
    }

    @Test
    public void deleteTweetTest() {
        Tweet tweet = user.createTweet("tweet de User");
        Retweet retweet1 = otherUser.createRetweet(tweet);
        Retweet retweet2 = otherUser.createRetweet(tweet);
        otherUser.deleteTweet(retweet1);

        assertNull(retweet1.getTweet());
        assertEquals(1, tweet.getRetweetsFromThisTweet().size());
        assertEquals(user.getScreenName(), tweet.getOwner());

        user.deleteTweet(tweet);
        assertNull(retweet2.getTweet());
        assertEquals(0, tweet.getRetweetsFromThisTweet().size());
        assertEquals("Deleted", tweet.getOwner());
    }
}
