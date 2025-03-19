package ar.edu.unlp.info.oo1.ejercicio_01;

public class Retweet extends TweetElement{
    private Tweet tweet;

    public Retweet(User retweetOwner, Tweet tweet) {
        super(retweetOwner);
        this.tweet = tweet;
        this.tweet.addRetweet(this);
    }

    public Tweet getTweet() {
        return tweet;
    }

    // Cuando el tweet principal es eliminado
    @Override
    public void deleteTweet() {
        super.deleteTweet();
        tweet = null;
    }

    public void deleteRetweet() {
        tweet.deleteRetweet(this);
        deleteTweet();
    }
}
