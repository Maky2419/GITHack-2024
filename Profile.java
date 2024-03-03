import java.util.Date;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner; 
public class Profile {
	String name;
	String username;
	String email;
	String employment;
	String password;
	LinkedList<Post> Posts;
	
	public Profile(String name, String username, String employment, String password,String Email) {
		this.name = name;
		this.username = username;
		this.email = Email;
		this.employment = employment;
		this.password = password;
		 Posts = new LinkedList<Post>();
		
	}

	public String getDate(Date date) {
		String dateString = "";
		String tempString = date.toString();
		dateString += tempString.substring(4, 7) + " ";
		dateString += tempString.substring(8, 10) + " ";
		dateString += tempString.substring(tempString.length()-4);
		return dateString;
	}

	
	
	public void create() {
		// Making an account
		// You need to fill in the following:
		// 1. Full Name 
		// 2. Username
		// 3. Make a password
		// 4. Occupation/Profession
	}
	
	public void login() {
		// logging into an account
		// 1.) Enter username
		// 2.) Enter your password
	}

		public static void main(String [] args) {
//			Profile u = new Profile(name, username, employment,password,);
//			Date d = new Date();
//			System.out.println("Today's date is: " + u.getDate(d));
		}
		

}
