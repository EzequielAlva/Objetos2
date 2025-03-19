package ar.edu.unlp.info.oo2.ejercicio1_v2;

public class Retweet {
    private Tweet tweet;

    public Retweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public Tweet getTweet() {
        return tweet;
    }
}
