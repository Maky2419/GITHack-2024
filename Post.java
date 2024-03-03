import java.util.ArrayList;
import java.util.Date;



public class Post {
	String Name;
	String UserName;
	String donationChoice;
	String category;
	String description;
	Date date;
	
	public Post( String donationChoice, String category, String description,String N,String UN) {
		//this.profile = currentProfile;
		this.donationChoice = donationChoice;
		this.category = category;
		this.description = description;
		this.date = new Date();
		this.Name =N;
		this.UserName =UN;
		
	}
	
	public static ArrayList<Post> sortPosts(ArrayList<Post> postList){
		for (int i = 0; i < postList.size(); i ++) {
			Post p1 = postList.get(i);
			for (int j = 0; j < postList.size(); j++) {
				Post p2 = postList.get(j);
				if (p1.date.compareTo(p2.date) > 0) {
					Post temp = postList.get(i);
					postList.set(i, p2);
					postList.set(j, temp);
				}
			}
		}
		return postList;
	}
	
	//filter is based on categoryButton.getText()
	public static ArrayList<Post> filterAndSortPosts(ArrayList<Post> postList, String filter){
		ArrayList<Post> filteredPostList = new ArrayList<Post>();
		for (int i = 0; i < postList.size(); i++) {
			Post tempPost = postList.get(i);
			if(tempPost.category.equals(filter)) {
				filteredPostList.add(tempPost);
			}
		}
		filteredPostList = sortPosts(filteredPostList);
		return filteredPostList;
	}
	
//	public String toString() {
//		return profile + donationChoice + category + description + date + "\n";
//	}
		
}
