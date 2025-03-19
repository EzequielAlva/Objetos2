package ar.edu.unlp.info.oo1.ejercicio_01;

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

    public void deleteUser(User user) {
        user.deleteTweetList();
        users.remove(user);
    }
}
