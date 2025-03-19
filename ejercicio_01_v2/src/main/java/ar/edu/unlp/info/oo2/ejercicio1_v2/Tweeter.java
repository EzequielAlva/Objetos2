package ar.edu.unlp.info.oo2.ejercicio1_v2;

import java.util.ArrayList;
import java.util.List;

public class Tweeter {
    private List<User> users;

    public Tweeter() {
        users = new ArrayList<>();
    }

    public List<User> getUsers() { return users; }

    public User createUser(String screenName) {
        User user = null;
        if(!containsUser(screenName)) {
            user = new User(screenName);
            users.add(user);
        }
        return user;  // para facilitar los tests
    }

    private boolean containsUser(String screenName) {
        return users.stream().anyMatch(user -> user.getScreenName().equals(screenName));
    }

    public void deleteUser(User userToDelete) {
        users.remove(userToDelete);
        users.stream().forEach(user -> user.deleteRetweetsFromTweetList(userToDelete.getTweets()));
        userToDelete.deleteTweetList();
        userToDelete.deleteRetweetList();
    }
}
