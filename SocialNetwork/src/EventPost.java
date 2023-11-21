import java.util.ArrayList;


public class EventPost extends Post {


    private int pages;


    public EventPost(String author, String text) {

        username= author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }






    public String getText() {
        return message;
    }



    /**
     * Displays details of post
     */

}
