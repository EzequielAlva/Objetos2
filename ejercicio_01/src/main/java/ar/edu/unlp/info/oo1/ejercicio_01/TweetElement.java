package ar.edu.unlp.info.oo1.ejercicio_01;

public abstract class TweetElement {
    public User owner;

    public TweetElement(User owner) {
        this.owner = owner;
    }

    public String getOwner() {
        if(this.owner != null)
            return this.owner.getScreenName();
        return "Deleted";
    }

    public void deleteTweet() {
        this.owner = null;
    };
}
