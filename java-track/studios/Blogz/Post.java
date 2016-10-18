package Blogz;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private String body;
	private String title;
	private final Date created;
	private static ArrayList<Date> timesEdited  = new ArrayList<>();
	
	public Post(String title, String body, Date created){
		Post.timesEdited.add(created);
		this.title = title;
		this.body = body;
		this.created = created;
	}
	
	
	private Post p; //This is just for testing
	
	
	public ArrayList<Date> getTimesEdited() {
		return Post.timesEdited;
	}
	
	public void edit(String newBody, String newTitle) {
		this.body = newBody;
		this.title = newTitle;
		Post.timesEdited.add(created);
		this.p = this; //For testing
	}
	
	//For testing
	public Post getPost(){
		return this.p;
	}
	
}
