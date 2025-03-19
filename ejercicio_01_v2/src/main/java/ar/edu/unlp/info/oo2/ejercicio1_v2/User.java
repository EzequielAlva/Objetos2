package ar.edu.unlp.info.oo2.ejercicio1_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String screenName;
    private List<Tweet> tweets;
    private List<Retweet> retweets;

    public User(String screenName) {
        this.screenName = screenName;
        tweets = new ArrayList<>();
        retweets = new ArrayList<>();
    }

    public String getScreenName() {
        return screenName;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public List<Retweet> getRetweets() {
        return retweets;
    }

    public Tweet createTweet(String text) {
        Tweet newTweet = null;
        if(text.length() >= 1 && text.length() <= 280) {
            newTweet = new Tweet(text);
            tweets.add(newTweet);
        }
        return newTweet;
    }

    public void deleteTweetList() {
        tweets.clear();
    }

    public Retweet createRetweet(Tweet tweet) {
        Retweet retweet = new Retweet(tweet);
        retweets.add(retweet);
        return retweet;
    }

    public void deleteRetweetList() {
        retweets.clear();
    }

    public void deleteRetweetsFromTweetList(List<Tweet> deletedTweets) {
        retweets = retweets.stream()
                .filter(retweet -> ! deletedTweets.contains(retweet.getTweet())).collect(Collectors.toList());
    }
}
