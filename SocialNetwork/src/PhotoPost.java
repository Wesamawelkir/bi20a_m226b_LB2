import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 * 
 * @author based on ObjectsFirst book
 *
 */

public class PhotoPost extends Post {
	
	

	private String filename;
	private String caption;
	
	
	/**
	 * Constructor for objects of class PhotoPost
	 * @param author
	 * @param filename
	 * @param caption
	 */
	public PhotoPost(String author, String filename, String caption) {
		
		username= author;
		this.filename = filename;
		this.caption = caption;
		timestamp = System.currentTimeMillis();
		likes = 0;
		comments = new ArrayList<>();
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



}

