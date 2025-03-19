package ar.edu.unlp.info.oo1.ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Tweet extends TweetElement{
    private String text;
    private List<Retweet> retweetsFromThisTweet;

    public Tweet(User owner, String text) {
        super(owner);
        this.text = text;
        retweetsFromThisTweet = new ArrayList<>();
    }

    public String getText() { return text; }

    public List<Retweet> getRetweetsFromThisTweet() { return retweetsFromThisTweet; }

    public void addRetweet(Retweet retweet) {
        retweetsFromThisTweet.add(retweet);
    }

    @Override
    public void deleteTweet() {
        super.deleteTweet();
        if(!retweetsFromThisTweet.isEmpty())
            retweetsFromThisTweet.stream().forEach(retweet -> retweet.deleteTweet());
        retweetsFromThisTweet.clear();
    }

    public void deleteRetweet(Retweet retweet) {
        retweetsFromThisTweet.remove(retweet);
    }
}
