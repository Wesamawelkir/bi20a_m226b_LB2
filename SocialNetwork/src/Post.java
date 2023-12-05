import java.util.ArrayList;

public class Post {
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;


    /**
     * Constructor for objects of class Post super()
     */
    public Post() {
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }

    public long getLikes() {return likes;}

    public void addComment(String text) {
        comments.add(text);
    }

    public ArrayList<String> getComments() {return comments;}

    public String getTimeStamp() {
        return timeString();
    }

    /**
     * Simulate display for the time being
     */
    public void display() {}

    private String timeString() {

        long current = System.currentTimeMillis();
        long pastMillis = current - timestamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return seconds + " seconds ago";
        }

    }

}

