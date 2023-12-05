import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 *
 * @author based on ObjectsFirst book
 *
 */

public class PhotoPost extends Post {
	private String username;
	private String filename;
	private String caption;

	/**
	 * Constructor for objects of class PhotoPost
	 * @param author
	 * @param filename
	 * @param caption
	 */
	public PhotoPost(String author, String filename, String caption) {
		super();
		username= author;
		this.filename = filename;
		this.caption = caption;
	}

	public String getImageFile() {
		return filename;
	}


	public String getCaption() {
		return caption;
	}

	/**
	 * Simulate display for the time being
	 */
	public void display() {

		System.out.println("Username " + username);
		System.out.println("FileName " + "{" + filename + "}");
		System.out.println("Caption " + caption);
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