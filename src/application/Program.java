package application;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import util.Comment;
import util.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String moment1 = ("21/06/2018 13:05:44");
		String title1 = ("Traveling to the New Zealand");
		String content1 = ("I'm going to visit this wonderful country!");
		Integer likes1 = 12;
		Post post = new Post(sdf.parse(moment1), title1, content1, likes1);
		Comment comment1 = new Comment("Have a nice Trip");
		post.addText(comment1);
		Comment comment2 = new Comment("Wow, that's AWESOME!");
		post.addText(comment2);
	
		String moment2 = ("28/07/2018 23:14:19");
		String title2 = ("Good night guys");
		String content2 = ("See you tomorrow");
		Integer likes2 = 5;
		Post post2 = new Post(sdf.parse(moment2), title2, content2, likes2);
		Comment comment3 = new Comment("Good Night");
		post2.addText(comment3);
		Comment comment4 = new Comment("May the Force be with you");
		post2.addText(comment4);
		
		System.out.println(post + "\n\n" + post2);
		
	
	}

}
