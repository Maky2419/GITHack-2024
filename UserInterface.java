import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.Choice;
import javax.swing.JPopupMenu;
import java.awt.SystemColor;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Label;
import javax.swing.JTextArea;

public class UserInterface {

	private JFrame frame;
	private JTextField Login_Username;
	private JTextField Login_Password;
	private JTextField Username;
	private JTextField Name;
	private JTextField Email;
	private JTextField Password;
	private JTextField Employement;
	Profile rn = new  Profile("Tester","akalam","Student","admin","maky.47.2004@gmail.com") ;
	ArrayList<Profile> profiles = new ArrayList<Profile>();
	Profile thisProfile; 
	ArrayList <Post> posts = new ArrayList<Post>();
	int PostCount = 0;
	int starter = 0;
	String Curr = "";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public UserInterface() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		
		FileReader fr = new FileReader("src/Profiles.txt");
        BufferedReader br = new BufferedReader(fr);
        String s ;
        while ((s = br.readLine()) != null){
            String[] arr = s.split(",");
            Profile r = new Profile(arr[0],arr[1],arr[2],arr[3],arr[4]);
            profiles.add(r);
}
        br.close();
        
        FileReader fr1 = new FileReader("src/Posts.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String s1 ;
        while ((s1 = br1.readLine()) != null){
            String[] arr = s1.split(",");
            Post r = new Post(arr[0],arr[1],arr[2],arr[3],arr[4]);
            for(int i= 0 ; i<profiles.size(); i++) {
            	if(profiles.get(i).name.equals(arr[3])) {
            		profiles.get(i).Posts.add(r);
            	}
            }
}
        br1.close();
        
        
        
 
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Card = new JPanel();
		frame.getContentPane().add(Card, "name_1498265437604400");
		Card.setLayout(new CardLayout(0, 0));
		
		JPanel LoginPage = new JPanel();
		Card.add(LoginPage, "name_1497961119868300");
		LoginPage.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Login Page");
		lblNewLabel_3.setBounds(349, 20, 112, 16);
		LoginPage.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Log in ");
		lblNewLabel_4.setBounds(359, 48, 61, 16);
		LoginPage.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setBounds(199, 129, 81, 16);
		LoginPage.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setBounds(199, 230, 71, 16);
		LoginPage.add(lblNewLabel_6);
		
		Login_Username = new JTextField();
		Login_Username.setBounds(310, 124, 130, 26);
		LoginPage.add(Login_Username);
		Login_Username.setColumns(10);
		
		Login_Password = new JTextField();
		Login_Password.setBounds(310, 225, 130, 26);
		LoginPage.add(Login_Password);
		Login_Password.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		
		btnNewButton.setBounds(310, 298, 117, 29);
		LoginPage.add(btnNewButton);
		
		JLabel lblNewLabel_6_1 = new JLabel("Dont have an Account? \n Sign up here");
		lblNewLabel_6_1.setBounds(256, 361, 253, 64);
		LoginPage.add(lblNewLabel_6_1);
		
		JButton btnNewButton_1 = new JButton("Create an Account here");
		
		btnNewButton_1.setBounds(280, 437, 181, 29);
		LoginPage.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 800, 572);
		LoginPage.add(panel_2);
		
		
		JPanel Profile = new JPanel();
		Profile.setBackground(Color.WHITE);
		Card.add(Profile, "name_1497961128931700");
		Profile.setLayout(null);
		
		JPanel Profile_Cat_Panel = new JPanel();
		Profile_Cat_Panel.setBounds(27, 87, 202, 466);
		Profile.add(Profile_Cat_Panel);
		Profile_Cat_Panel.setLayout(null);
		
		JLabel Profile_Cat_Title = new JLabel("Cathegories");
		Profile_Cat_Title.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		Profile_Cat_Title.setBounds(6, 19, 190, 16);
		Profile_Cat_Panel.add(Profile_Cat_Title);
		
		JLabel Profile_line1 = new JLabel("____________________________");
		
		Profile_line1.setBounds(0, 34, 202, 16);
		Profile_Cat_Panel.add(Profile_line1);
		
		JPanel Home = new JPanel();
		Home.setBounds(0, 0, 202, 572);
		Profile_Cat_Panel.add(Home);
		Home.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home Page");
		lblNewLabel.setBounds(372, 5, 70, 16);
		Home.add(lblNewLabel);
		
		JButton HomePage_Btn_ClothingShoes_1_1 = new JButton("Clothing and shoes");
		HomePage_Btn_ClothingShoes_1_1.setBounds(16, 78, 157, 29);
		Home.add(HomePage_Btn_ClothingShoes_1_1);
		
		JButton HomePage_Btn_Hygiene_1_1 = new JButton("Hygiene Items");
		HomePage_Btn_Hygiene_1_1.setBounds(16, 181, 157, 29);
		Home.add(HomePage_Btn_Hygiene_1_1);
		
		JButton HomePage_Btn_NonPerishable_1_1 = new JButton("Non-perishables");
		HomePage_Btn_NonPerishable_1_1.setBounds(10, 290, 166, 29);
		Home.add(HomePage_Btn_NonPerishable_1_1);
		
		JButton HomePage_Btn_ToysBoardGame_1_1 = new JButton("Toys & Board Games");
		HomePage_Btn_ToysBoardGame_1_1.setBounds(10, 405, 166, 29);
		Home.add(HomePage_Btn_ToysBoardGame_1_1);
		
		
		
		
		JLabel Profile_line4 = new JLabel("_________________________________________________________________________________________________________________");
		Profile_line4.setBounds(6, 59, 794, 16);
		Profile.add(Profile_line4);
		
		JPanel Profile_Middle = new JPanel();
		Profile_Middle.setBounds(241, 87, 376, 466);
		Profile.add(Profile_Middle);
		Profile_Middle.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Profile");
		lblNewLabel_2_1.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(16, 17, 75, 16);
		Profile_Middle.add(lblNewLabel_2_1);
		String im = (String) rn.name.substring(0, 1);
		JLabel Profile_Image = new JLabel(im);
		Profile_Image.setFont(new Font("Myanmar MN", Font.PLAIN, 30));
		Profile_Image.setBounds(16, 57, 61, 77);
		Profile_Middle.add(Profile_Image);
		
		JLabel Profile_line2 = new JLabel("____________________________________________________");
		Profile_line2.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		Profile_line2.setBounds(6, 32, 364, 16);
		Profile_Middle.add(Profile_line2);
		
		JLabel Profile_Name = new JLabel("Name");
		Profile_Name.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		Profile_Name.setBounds(146, 57, 205, 16);
		Profile_Middle.add(Profile_Name);
		
		JLabel Profile_Email = new JLabel("Email");
		Profile_Email.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		Profile_Email.setBounds(146, 118, 205, 16);
		Profile_Middle.add(Profile_Email);
		
		JLabel Profile_Username = new JLabel("Contact information:");
		Profile_Username.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		Profile_Username.setBounds(146, 90, 205, 16);
		Profile_Middle.add(Profile_Username);
		
		JButton LogOut = new JButton("Log out of Account");
		
		LogOut.setBounds(196, 431, 174, 29);
		Profile_Middle.add(LogOut);
		
		JButton Profile_Btn_ClothingShoes_1 = new JButton("Applications");
		Profile_Btn_ClothingShoes_1.setBounds(283, 35, 117, 29);
		Profile.add(Profile_Btn_ClothingShoes_1);
		
		JButton Profile_Btn_ClothingShoes_1_2 = new JButton("Home");
		
		Profile_Btn_ClothingShoes_1_2.setBounds(677, 35, 117, 29);
		Profile.add(Profile_Btn_ClothingShoes_1_2);
		
		JLabel Profile_Cat_Title_1 = new JLabel("Donations");
		Profile_Cat_Title_1.setFont(new Font("Myanmar MN", Font.PLAIN, 13));
		Profile_Cat_Title_1.setBounds(6, 30, 211, 39);
		Profile.add(Profile_Cat_Title_1);
		
		JPanel Profile_Cat_Discover = new JPanel();
		Profile_Cat_Discover.setBounds(629, 87, 165, 466);
		Profile.add(Profile_Cat_Discover);
		Profile_Cat_Discover.setLayout(null);
		
		JLabel Profile_Discover = new JLabel("Discover");
		Profile_Discover.setBounds(53, 18, 61, 16);
		Profile_Cat_Discover.add(Profile_Discover);
		
		JLabel Profile_line3 = new JLabel("_______________________");
		Profile_line3.setBounds(0, 34, 165, 16);
		Profile_Cat_Discover.add(Profile_line3);
		
		JPanel CreatePost = new JPanel();
		CreatePost.setLayout(null);
		CreatePost.setBackground(Color.WHITE);
		Card.add(CreatePost, "name_1497961137652400");
		
		JPanel CreatePost_Cat_Panel = new JPanel();
		CreatePost_Cat_Panel.setLayout(null);
		CreatePost_Cat_Panel.setBounds(27, 87, 202, 466);
		CreatePost.add(CreatePost_Cat_Panel);
		
		JLabel CreatePost_Cat_Title = new JLabel("Cathegories");
		CreatePost_Cat_Title.setBounds(6, 19, 190, 16);
		CreatePost_Cat_Panel.add(CreatePost_Cat_Title);
		
		JLabel CreatePost_line1 = new JLabel("____________________________");
		CreatePost_line1.setBounds(0, 34, 202, 16);
		CreatePost_Cat_Panel.add(CreatePost_line1);
		
		JButton CreatePost_Btn_NonPerishable = new JButton("Non-perishables");
		CreatePost_Btn_NonPerishable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CreatePost_Btn_NonPerishable.setBounds(16, 289, 166, 29);
		CreatePost_Cat_Panel.add(CreatePost_Btn_NonPerishable);
		
		JButton CreatePost_Btn_ToysBoardGame = new JButton("Toys & Board Games");
		CreatePost_Btn_ToysBoardGame.setBounds(16, 404, 166, 29);
		CreatePost_Cat_Panel.add(CreatePost_Btn_ToysBoardGame);
		
		JPanel Home_1_1 = new JPanel();
		Home_1_1.setLayout(null);
		Home_1_1.setBounds(0, 0, 800, 572);
		CreatePost_Cat_Panel.add(Home_1_1);
		
		JButton HomePage_Btn_Hygiene_1 = new JButton("Hygiene Items");
		HomePage_Btn_Hygiene_1.setBounds(22, 180, 157, 29);
		Home_1_1.add(HomePage_Btn_Hygiene_1);
		
		JButton HomePage_Btn_ClothingShoes_1 = new JButton("Clothing and shoes");
		
		HomePage_Btn_ClothingShoes_1.setBounds(22, 77, 157, 29);
		Home_1_1.add(HomePage_Btn_ClothingShoes_1);
		
		JPanel HomePage_Middle_1 = new JPanel();
		HomePage_Middle_1.setLayout(null);
		HomePage_Middle_1.setBounds(241, 87, 376, 466);
		CreatePost.add(HomePage_Middle_1);
		
		JLabel HomePage_post_1 = new JLabel("Posts");
		HomePage_post_1.setBounds(16, 21, 61, 16);
		HomePage_Middle_1.add(HomePage_post_1); 
		
		JLabel HomePage_line2_1 = new JLabel("____________________________________________________");
		HomePage_line2_1.setBounds(6, 32, 364, 16);
		HomePage_Middle_1.add(HomePage_line2_1);
		
		JButton HomePage_Btn_Publish = new JButton("Publish");
		
		HomePage_Btn_Publish.setBounds(249, 261, 79, 29);
		HomePage_Middle_1.add(HomePage_Btn_Publish);
		
		Choice category_choice = new Choice();
		category_choice.setBackground(SystemColor.inactiveCaptionBorder);
		category_choice.setBounds(222, 71, 106, 30);
		category_choice.add("Clothing & Shoes");
		category_choice.add("Hygiene items");
		category_choice.add("Non-perishables");
		category_choice.add("Toys & Board Games");
		HomePage_Middle_1.add(category_choice);
		
		Choice donation_choice = new Choice();
		donation_choice.setForeground(Color.LIGHT_GRAY);
		donation_choice.setBackground(SystemColor.inactiveCaptionBorder);
		donation_choice.setBounds(110, 71, 106, 30);
		donation_choice.add("Donating");
		donation_choice.add("In Need");
		HomePage_Middle_1.add(donation_choice);
		
		JTextArea textField = new JTextArea();
		textField.setBounds(6, 115, 341, 146);
		textField.setLineWrap(true);
		textField.setWrapStyleWord(true);
		HomePage_Middle_1.add(textField);
		
		JPanel HomePage_Discover_2 = new JPanel();
		HomePage_Discover_2.setLayout(null);
		HomePage_Discover_2.setBounds(623, 87, 165, 466);
		CreatePost.add(HomePage_Discover_2);
		
		JLabel HomePage_Discover_1_1 = new JLabel("Discover");
		HomePage_Discover_1_1.setBounds(53, 18, 61, 16);
		HomePage_Discover_2.add(HomePage_Discover_1_1);
		
		JLabel HomePage_line3_1 = new JLabel("__________________________");
		HomePage_line3_1.setBounds(0, 34, 165, 16);
		HomePage_Discover_2.add(HomePage_line3_1);
		
		JLabel HomePage_line4_1 = new JLabel("_____________________________________________________________________________________________________________________");
		HomePage_line4_1.setBounds(-6, 60, 794, 16);
		CreatePost.add(HomePage_line4_1);
		
		JLabel HomePage_Donation_Title_1 = new JLabel("Donations");
		HomePage_Donation_Title_1.setBounds(15, 41, 190, 16);
		CreatePost.add(HomePage_Donation_Title_1);
		
		JButton HomePage_Btn_Application_1 = new JButton("Applications");
		HomePage_Btn_Application_1.setBounds(271, 36, 117, 29);
		CreatePost.add(HomePage_Btn_Application_1);
		
		JButton HomePage_Btn_Profile_1 = new JButton("Profile");
		
		HomePage_Btn_Profile_1.setBounds(662, 36, 117, 29);
		CreatePost.add(HomePage_Btn_Profile_1);
		
		
		JPanel HomePage = new JPanel();
		HomePage.setLayout(null);
		HomePage.setBackground(new Color(255, 221, 214));
		Card.add(HomePage, "name_1497961137652400");
		
		JPanel HomePage_Cat_Panel = new JPanel();
		HomePage_Cat_Panel.setLayout(null);
		HomePage_Cat_Panel.setBounds(27, 87, 202, 466);
		HomePage.add(HomePage_Cat_Panel);
		
		JLabel HomePage_Cat_Title = new JLabel("Cathegories");
		HomePage_Cat_Title.setBounds(6, 19, 190, 16);
		HomePage_Cat_Panel.add(HomePage_Cat_Title);
		
		JLabel HomePage_line1 = new JLabel("____________________________");
		HomePage_line1.setBounds(0, 34, 202, 16);
		HomePage_Cat_Panel.add(HomePage_line1);
		
		JButton HomePage_Btn_NonPerishable = new JButton("Non-perishables");
		
		HomePage_Btn_NonPerishable.setBounds(16, 289, 166, 29);
		HomePage_Cat_Panel.add(HomePage_Btn_NonPerishable);
		
		JButton HomePage_Btn_ToysBoardGame = new JButton("Toys & Board Games");
		
		HomePage_Btn_ToysBoardGame.setBounds(16, 404, 166, 29);
		HomePage_Cat_Panel.add(HomePage_Btn_ToysBoardGame);
		
		JPanel Home_1 = new JPanel();
		Home_1.setLayout(null);
		Home_1.setBounds(0, 0, 800, 572);
		HomePage_Cat_Panel.add(Home_1);
		
		JButton HomePage_Btn_Hygiene = new JButton("Hygiene Items");
		
		HomePage_Btn_Hygiene.setBounds(22, 180, 157, 29);
		Home_1.add(HomePage_Btn_Hygiene);
		
		JButton HomePage_Btn_ClothingShoes = new JButton("Clothing and shoes");
		HomePage_Btn_ClothingShoes.setBounds(22, 77, 157, 29);
		Home_1.add(HomePage_Btn_ClothingShoes);
		
		
		JLabel HomePage_line4 = new JLabel("_________________________________________________________________________________________________________________");
		HomePage_line4.setBounds(6, 59, 794, 16);
		HomePage.add(HomePage_line4);
		
		JPanel HomePage_Middle = new JPanel();
		HomePage_Middle.setLayout(null);
		HomePage_Middle.setBounds(241, 87, 376, 466);
		HomePage.add(HomePage_Middle);
		
		JLabel HomePage_post = new JLabel("Posts");
		HomePage_post.setBounds(16, 21, 61, 16);
		HomePage_Middle.add(HomePage_post);
		
		JLabel HomePage_line2 = new JLabel("____________________________________________________");
		HomePage_line2.setBounds(6, 32, 364, 16);
		HomePage_Middle.add(HomePage_line2);
		
		JLabel PostsHere = new JLabel("PostsHere");
		PostsHere.setVerticalAlignment(SwingConstants.TOP);
		PostsHere.setBounds(16, 59, 339, 356);
		HomePage_Middle.add(PostsHere);
		
		JButton Back = new JButton("Back");
		
		Back.setBounds(6, 426, 117, 29);
		HomePage_Middle.add(Back);
		
		JButton Next = new JButton("Next");
		
		Next.setBounds(222, 426, 117, 29);
		HomePage_Middle.add(Next);
		
		JButton HomePage_Btn_Application = new JButton("Applications");
		HomePage_Btn_Application.setBounds(283, 35, 117, 29);
		HomePage.add(HomePage_Btn_Application);
		
		JButton HomePage_Btn_Profile = new JButton("Profile");
		
		HomePage_Btn_Profile.setBounds(674, 35, 117, 29);
		HomePage.add(HomePage_Btn_Profile);
		
		JLabel HomePage_Donation_Title = new JLabel("Donations");
		HomePage_Donation_Title.setBounds(27, 40, 190, 16);
		HomePage.add(HomePage_Donation_Title);
		
		JPanel HomePage_Discover = new JPanel();
		HomePage_Discover.setLayout(null);
		HomePage_Discover.setBounds(629, 87, 165, 410);
		HomePage.add(HomePage_Discover);
		
		JLabel HomePage_Discover_1 = new JLabel("Discover");
		HomePage_Discover_1.setBounds(53, 18, 61, 16);
		HomePage_Discover.add(HomePage_Discover_1);
		
		JLabel HomePage_line3 = new JLabel("_______________________");
		HomePage_line3.setBounds(0, 34, 165, 16);
		HomePage_Discover.add(HomePage_line3);
		
		JButton HomePage_Btn_NewPost_1 = new JButton("New Post");
		HomePage_Btn_NewPost_1.setBounds(661, 513, 112, 29);
		HomePage.add(HomePage_Btn_NewPost_1);
		
		
		
		JPanel Application = new JPanel();
		Application.setLayout(null);
		Application.setBackground(Color.WHITE);
		Card.add(Application, "name_1497961147088800");
		
		JPanel Application_Cat_Panel = new JPanel();
		Application_Cat_Panel.setLayout(null);
		Application_Cat_Panel.setBounds(27, 87, 202, 466);
		Application.add(Application_Cat_Panel);
		
		JPanel Application_pane = new JPanel();
		Application_pane.setLayout(null);
		Application_pane.setBounds(0, 0, 800, 572);
		Application_Cat_Panel.add(Application_pane);
		
		JLabel lblNewLabel_1 = new JLabel("Home Page");
		lblNewLabel_1.setBounds(372, 5, 70, 16);
		Application_pane.add(lblNewLabel_1);
		
		JLabel Application_line1 = new JLabel("____________________________");
		Application_line1.setHorizontalAlignment(SwingConstants.CENTER);
		Application_line1.setBounds(0, 30, 201, 16);
		Application_pane.add(Application_line1);
		
		JLabel Application_Cat_Title = new JLabel("Cathegories");
		Application_Cat_Title.setHorizontalAlignment(SwingConstants.CENTER);
		Application_Cat_Title.setBounds(65, 11, 63, 16);
		Application_pane.add(Application_Cat_Title);
		
		JButton Application_Btn_ClothingShoes = new JButton("Clothing and Shoes");
		Application_Btn_ClothingShoes.setBounds(22, 125, 150, 29);
		Application_pane.add(Application_Btn_ClothingShoes);
		
		JButton Application_Btn_Hygiene = new JButton("Hygiene Items");
		Application_Btn_Hygiene.setBounds(22, 205, 150, 29);
		Application_pane.add(Application_Btn_Hygiene);
		
		JButton Application_Btn_NonPerishable = new JButton("Non-perishables");
		Application_Btn_NonPerishable.setBounds(22, 285, 150, 29);
		Application_pane.add(Application_Btn_NonPerishable);
		
		JButton Application_Btn_ToysBoardGames = new JButton("Toys & Board Games");
		Application_Btn_ToysBoardGames.setBounds(22, 365, 150, 29);
		Application_pane.add(Application_Btn_ToysBoardGames);
		Application_Btn_ClothingShoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		JLabel Application_line4 = new JLabel("_________________________________________________________________________________________________________________");
		Application_line4.setHorizontalAlignment(SwingConstants.CENTER);
		Application_line4.setBounds(-52, 62, 900, 16);
		Application.add(Application_line4);
		
		JPanel Application_Middle = new JPanel();
		Application_Middle.setLayout(null);
		Application_Middle.setBounds(241, 87, 376, 466);
		Application.add(Application_Middle);
		
		JLabel Application_Title = new JLabel("Applications");
		Application_Title.setHorizontalAlignment(SwingConstants.CENTER);
		Application_Title.setBounds(149, 11, 68, 16);
		Application_Middle.add(Application_Title);
		
		JLabel Application_line2 = new JLabel("____________________________________________________");
		Application_line2.setHorizontalAlignment(SwingConstants.CENTER);
		Application_line2.setBounds(0, 30, 376, 16);
		Application_Middle.add(Application_line2);
		
		JButton btnNewButton_4 = new JButton("Saved");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(24, 57, 89, 23);
		Application_Middle.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Applied");
		btnNewButton_5.setBounds(143, 57, 89, 23);
		Application_Middle.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("All");
		btnNewButton_6.setBounds(266, 57, 89, 23);
		Application_Middle.add(btnNewButton_6);
		
		JButton HomePage_Btn_NewPost_2 = new JButton("New Post");
		HomePage_Btn_NewPost_2.setBounds(287, 426, 79, 29);
		Application_Middle.add(HomePage_Btn_NewPost_2);
		
		JButton Application_Btn_ClothingShoes_1 = new JButton("Applications");
		Application_Btn_ClothingShoes_1.setBounds(175, 35, 117, 29);
		Application.add(Application_Btn_ClothingShoes_1);
		
		JButton Application_Btn_Home = new JButton("Home");
		Application_Btn_Home.setBounds(575, 35, 117, 29);
		Application.add(Application_Btn_Home);
		
		JLabel Application_Donation_Title = new JLabel("Donations");
		Application_Donation_Title.setBounds(27, 40, 190, 16);
		Application.add(Application_Donation_Title);
		
		JPanel Application_Cat_Discover = new JPanel();
		Application_Cat_Discover.setLayout(null);
		Application_Cat_Discover.setBounds(629, 87, 165, 466);
		Application.add(Application_Cat_Discover);
		
		JLabel Profile_Discover_1 = new JLabel("Discover");
		Profile_Discover_1.setHorizontalAlignment(SwingConstants.CENTER);
		Profile_Discover_1.setBounds(63, 11, 61, 16);
		Application_Cat_Discover.add(Profile_Discover_1);
		
		JLabel Profile_line3_1 = new JLabel("_______________________");
		Profile_line3_1.setHorizontalAlignment(SwingConstants.CENTER);
		Profile_line3_1.setBounds(0, 30, 165, 16);
		Application_Cat_Discover.add(Profile_line3_1);
		
		JPanel SignUp = new JPanel();
		Card.add(SignUp, "name_1497961156925100");
		SignUp.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Create Account ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(279, 36, 163, 16);
		SignUp.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Username");
		lblNewLabel_8.setBounds(235, 90, 89, 16);
		SignUp.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Name");
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1.setBounds(235, 150, 110, 16);
		SignUp.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Email");
		lblNewLabel_8_2.setBounds(235, 210, 61, 16);
		SignUp.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Password");
		lblNewLabel_8_3.setBounds(235, 270, 61, 16);
		SignUp.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("Employement");
		lblNewLabel_8_4.setBounds(235, 330, 66, 16);
		SignUp.add(lblNewLabel_8_4);
		
		Username = new JTextField();
		Username.setBounds(306, 90, 130, 26);
		SignUp.add(Username);
		Username.setColumns(10);
		
		Name = new JTextField();
		Name.setColumns(10);
		Name.setBounds(306, 150, 130, 26);
		SignUp.add(Name);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(306, 210, 130, 26);
		SignUp.add(Email);
		
		Password = new JTextField();
		Password.setColumns(10);
		Password.setBounds(306, 270, 130, 26);
		SignUp.add(Password);
		
		Employement = new JTextField();
		Employement.setColumns(10);
		Employement.setBounds(306, 330, 130, 26);
		SignUp.add(Employement);
		
		JButton btnNewButton_2 = new JButton("Register");
		
		btnNewButton_2.setBounds(308, 400, 117, 29);
		SignUp.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Have an account? Login here!");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(269, 440, 197, 16);
		SignUp.add(lblNewLabel_9);
		
		JButton btnNewButton_3 = new JButton("Login");
		
		btnNewButton_3.setBounds(308, 467, 117, 29);
		SignUp.add(btnNewButton_3);
		HomePage_Btn_ClothingShoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				starter = 0;
				Curr = "Clothing & Shoes";
				LinkedList<Post> R = Finder("Clothing & Shoes");
				String r = "";
				if(PostCount < 3) {
					
					for(int i = 0; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
					}
					System.out.println(r);
				}
				else {
					int counter =0;
					for(int i = starter; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
						counter++;
						if(counter == 3) {
							break;
						}
					}
					System.out.println(r);
				}
				
				
			PostsHere.setText("<html><p style=\"width:250px\">"+convertToMultiline(r)+"</p></html>");
				//PostsHere.setText(r);
				//PostsHere.setUI(MultiLineLabelUI.labelUI);
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
			}
			
		});
		
		Profile_Btn_ClothingShoes_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
			}
		});
		HomePage_Btn_Profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(true);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile P = new Profile(Name.getText(),Username.getText(),Employement.getText(),Password.getText(),Email.getText());
				profiles.add(P);
				Username.setText("");
				Name.setText("");
				Employement.setText("");
				Password.setText("");
				Email.setText("");
				
				Profile.setVisible(false);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				LoginPage.setVisible(true);
				SignUp.setVisible(false);
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(false);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				LoginPage.setVisible(true);
				SignUp.setVisible(false);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userInput = Login_Username.getText();
				// 2.) Enter your password
				String passwordInput = Login_Password.getText();
				
				//verifying
				if(verification(userInput, passwordInput)) {
					Profile.setVisible(true);	
					HomePage.setVisible(false);	
					Application.setVisible(false);
					LoginPage.setVisible(false);
					SignUp.setVisible(false);
					
					
					for(int i = 0; i< profiles.size(); i++) {
						if(profiles.get(i).username.equals(userInput)) {
							rn = profiles.get(i);
							System.out.print("found");
						}
					}
					Profile_Name.setText("Name: " + rn.name);
					Profile_Username.setText("Username: " + rn.username);
					Profile_Email.setText("Email: "+ rn.email);
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong User and Password");
					Login_Username.setText("");
					Login_Password.setText("");
					
				}
				
				String im = (String) rn.name.substring(0, 1);
				Profile_Image.setText(im);
				
				
				
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(false);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				LoginPage.setVisible(false);
				SignUp.setVisible(true);
				CreatePost.setVisible(false);
			}
		});
		
		LogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(false);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				LoginPage.setVisible(true);
				SignUp.setVisible(false);
			}
		});
		
		HomePage_Btn_Publish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String donation = donation_choice.getSelectedItem();
				String category = category_choice.getSelectedItem();
				String description = textField.getText();
				
				Post p = new Post(donation,category,description,rn.name,rn.username);
				rn.Posts.add(p);
				for(int i = 0; i< rn.Posts.size();i++) {
					System.out.println(rn.Posts.get(i).description);
				}
				PostCount++;
				
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
				LoginPage.setVisible(false);
				SignUp.setVisible(false);
				CreatePost.setVisible(false);
			
				
				//makePost(posts, thisProfile);
			}
		});
		HomePage_Btn_Profile_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(true);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				LoginPage.setVisible(false);
				SignUp.setVisible(false);
			}
		});
		HomePage_Btn_ClothingShoes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
				LoginPage.setVisible(false);
				SignUp.setVisible(false);
			}
		});
		HomePage_Btn_Hygiene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Curr = "Hygiene items";
				LinkedList<Post> R = Finder("Hygiene items");
				starter = 0;
				String r = "";
				if(PostCount < 3) {
					
					for(int i = 0; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
					}
					System.out.println(r);
				}
				else {
					int counter =0;
					for(int i = starter; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
						counter++;
						if(counter == 3) {
							break;
						}
					}
					System.out.println(r);
				}
				
				
				PostsHere.setText("<html><p style=\"width:250px\">"+convertToMultiline(r)+"</p></html>");
				//PostsHere.setText(r);
				//PostsHere.setUI(MultiLineLabelUI.labelUI);
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
			}
		});
		HomePage_Btn_NonPerishable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Curr = "Non-perishables";
				
				LinkedList<Post> R = Finder("Non-perishables");
				starter = 0;
				
				String r = "";
				if(PostCount < 3) {
					
					for(int i = 0; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
					}
					System.out.println(r);
				}
				else {
					int counter =0;
					for(int i = starter; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
						counter++;
						if(counter == 3) {
							break;
						}
					}
					System.out.println(r);
				}
				
				PostsHere.setText("<html><p style=\"width:250px\">"+convertToMultiline(r)+"</p></html>");
				//PostsHere.setText(r);
				//PostsHere.setUI(MultiLineLabelUI.labelUI);
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
			}
		});
		HomePage_Btn_ToysBoardGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						LinkedList<Post> R = Finder("Toys & Board Games");
						starter = 0;
						Curr = "Toys & Board Games";
						
						String r = "";
						if(PostCount < 3) {
							
							for(int i = 0; i< R.size();i++) {
								r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
										+ "\n" +R.get(i).description + "\n";
							}
							System.out.println(r);
						}
						else {
							int counter =0;
							for(int i = starter; i< R.size();i++) {
								r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
										+ "\n" +R.get(i).description + "\n";
								counter++;
								if(counter == 3) {
									break;
								}
							}
							System.out.println(r);
						}
						PostsHere.setText("<html><p style=\"width:250px\">"+convertToMultiline(r)+"</p></html>");
						//PostsHere.setText(r);
						//PostsHere.setUI(MultiLineLabelUI.labelUI);
						Profile.setVisible(false);	
						HomePage.setVisible(true);	
						Application.setVisible(false);
					
			}
		});
		
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				starter = starter+3;
				LinkedList<Post> R = Finder(Curr);
				String r = "";
				
				if(PostCount < 3) {
					
					for(int i = 0; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
					}
					System.out.println(r);
				}
				else {
					int counter =0;
					for(int i = starter; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
						counter++;
						if(counter == 3) {
							break;
						}
					}
				}
				
			PostsHere.setText("<html><p style=\"width:250px\">"+convertToMultiline(r)+"</p></html>");
				//PostsHere.setText(r);
				//PostsHere.setUI(MultiLineLabelUI.labelUI);
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
			}
		});
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(starter != 0) {
					starter = starter-3;
				}
				
				LinkedList<Post> R = Finder(Curr);
				String r = "";
				if(PostCount < 3) {
					
					for(int i = 0; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
					}
					System.out.println(r);
				}
				else {
					//int counter = 0;
					for(int i = starter; i< R.size();i++) {
						r = r +"_____________________________________\n"+ R.get(i).Name + "\n"+R.get(i).UserName +""
								+ "\n" +R.get(i).description + "\n";
						
					}
					System.out.println(r);
				}
				
				
			PostsHere.setText("<html><p style=\"width:250px\">"+convertToMultiline(r)+"</p></html>");
				//PostsHere.setText(r);
				//PostsHere.setUI(MultiLineLabelUI.labelUI);
				Profile.setVisible(false);	
				HomePage.setVisible(true);	
				Application.setVisible(false);
			}
		});
		HomePage_Btn_NewPost_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Profile.setVisible(false);	
				HomePage.setVisible(false);	
				Application.setVisible(false);
				LoginPage.setVisible(false);
				SignUp.setVisible(false);
				CreatePost.setVisible(true);
			}
		});
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		       
		    	  File myFile = new File("src/Profiles.txt");
		          PrintWriter pw;
				try {
					pw = new PrintWriter(myFile);
					pw.flush();
					for(int i = 0; i < profiles.size();i++) {
						pw.println(profiles.get(i).name+","+profiles.get(i).username+","+profiles.get(i).employment+","+profiles.get(i).password +","+profiles.get(i).email);
					}
					
			          pw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				  File myFile1 = new File("src/Posts.txt");
		          PrintWriter pw1;
				try {
					pw1 = new PrintWriter(myFile1);
					pw1.flush();
					for(int i = 0; i < profiles.size();i++) {
						for(int k = 0; k < profiles.get(i).Posts.size();k++) {
						pw1.println(profiles.get(i).Posts.get(k).donationChoice+","+profiles.get(i).Posts.get(k).category+","+profiles.get(i).Posts.get(k).description+","+profiles.get(i).Posts.get(k).Name +","+profiles.get(i).Posts.get(k).UserName);
					}}
					
			          pw1.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		         
		    	
		    }
		});
	}
	
	
	public boolean verification(String userInput, String passwordInput) {
		//iterating for loop to see if there is a user and then password that is the same as the user and password stored inside the ArrayList
		for (int i = 0; i < profiles.size(); i++) {
			Profile tempProfile = profiles.get(i);
			if (tempProfile.username.equals(userInput)) {
				if(tempProfile.password.equals(passwordInput)) {
					return true;
				}
			}
		}
		return false;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public static void makePost(ArrayList<Post> postList, Profile currentProfile) {
		Choice category_choice = new Choice();
		Choice donationChoice = new Choice();
		TextField textField = new TextField();
		
		String donation = donationChoice.getSelectedItem();
		String category = category_choice.getSelectedItem();
		String description = "/@" + textField.getText();
		
	//	Post post = new Post(currentProfile, donation, category, description);
		//postList.add(post);
	}
	public LinkedList<Post> Finder(String K){
		LinkedList<Post> R = new LinkedList<>();
		for(int i = 0; i< profiles.size();i++) {
			for(int k = 0; k < profiles.get(i).Posts.size();k++) {
				if(profiles.get(i).Posts.get(k).category.equals(K)) {
					R.add(profiles.get(i).Posts.get(k));
				}
			}
		}
		return R;
	}
	public static String convertToMultiline(String orig)
	{
	    return "<html>" + orig.replaceAll("\n", "<br>");
	}
}