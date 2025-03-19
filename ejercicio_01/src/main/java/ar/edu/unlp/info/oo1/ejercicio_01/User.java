package ar.edu.unlp.info.oo1.ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String screenName;
    private List<TweetElement> tweets;

    public User(String screenName) {
        this.screenName = screenName;
        tweets = new ArrayList<>();
    }

    public String getScreenName() {
        return screenName;
    }

    public List<TweetElement> getTweets() {
        return tweets;
    }

    public Tweet createTweet(String text) {
        Tweet newTweet = null;
        if(text.length() >= 1 && text.length() <= 280) {
            newTweet = new Tweet(this, text);
            tweets.add(newTweet);
        }
        return newTweet; // retorno para testear más cómodo
    }

    public void deleteTweetList() {
        tweets.stream().forEach(tweet -> tweet.deleteTweet());
        tweets.clear();
    }

    public void deleteTweet(TweetElement tweetElement) {
        if(tweets.contains(tweetElement)) {
            if(tweetElement instanceof Tweet) tweetElement.deleteTweet();
            else ((Retweet) tweetElement).deleteRetweet();
            tweets.remove(tweetElement);
        }
    }

    public Retweet createRetweet(Tweet tweet) {
        Retweet retweet = new Retweet(this, tweet);
        tweets.add(retweet);
        return retweet; // retorno para testear más cómodo
    }
}
