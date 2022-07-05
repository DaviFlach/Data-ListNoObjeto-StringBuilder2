package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> texts = new ArrayList<>();

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}



	public String getTitle() {
		return title;
	}


	public String getContent() {
		return content;
	}


	public Integer getLikes() {
		return likes;
	}

	public void addText(Comment text) {
		texts.add(text);
	}

	public List<Comment> getTexts() {
		return texts;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + "likes - " + sdf.format(moment) + "\n" + content + "\nComments: \n");
		for (Comment c : texts) {
			sb.append(c.getText() + "\n");
			
		}
		return sb.toString();	
		
				
	}



	
	
	
	
	

}
