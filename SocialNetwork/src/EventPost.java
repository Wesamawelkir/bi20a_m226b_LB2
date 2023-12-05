import java.util.ArrayList;

public class EventPost extends Post {

    private String author;
    private int pages;

    /**
     * Constructor for objects of class EventPost
     * @param author
     * @param pages
     */
    public EventPost(String author, int pages) {
        super();
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    /**
     * Simulate display for the time being
     */
    public void display() {

        System.out.println("Author " + author);
        System.out.println("Pages " + pages);
        System.out.println("Posted " + super.getTimeStamp());

        if (super.getLikes() > 0) {
            System.out.println(super.getLikes() + " people like this.");
        } else {
            System.out.println();
        }
        if (super.getComments().isEmpty()) {
            System.out.println("No Comments yet...");

        } else {
            System.out.println("   " + super.getComments().size() + " comment(s). Press C to view");
        }
    }

}