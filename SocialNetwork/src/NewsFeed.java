import java.util.ArrayList;

public class NewsFeed {
	
	public ArrayList<Post> meineListe = new ArrayList<Post>();

	public NewsFeed() {
		
		messages = new ArrayList<>();
		photos = new ArrayList<>();
	}
	
	
	public void addPost(Post post) {
		meineListe.add(post);
	}
	
	
	public void show() {

		Post[] Post;
		for(Post post : Post) {
			meineListe.display();
			System.out.println();
		}
		
	}

}
