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
	public PhotoPost(String username, long timestamp, int likes,ArrayList<String> comments,String filename, String caption) {
		
		super();
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

	void Post() {

		super.display();
		System.out.println("FileName " + "{" + filename + "}");
		System.out.println("Caption " + caption);


	}

}

