package presentation;

import java.util.ArrayList;
import java.util.List;

import domain.User;
import domain.Video;

public class Main {
	private static List<User> users = new ArrayList<User>();
	
	public static void main(String[] args) {
		User user = new User("Jinson", "Pardo", "1234");
		users.add(user);
		
		Video video = new Video("www.youtuve.com/1234", "BCN");
		video.setTag("Jinson Pardo Aroca");
		video.setTag("Estefy Perez");
		user.setVideo(video);
		
		List<Video> videos = new ArrayList<Video>();
		List<String> tags = new ArrayList<String>();
		tags.add("España");
		tags.add("Real Madrid");
		videos.add(new Video("www.youtuve.com/222", "MAD", tags));
		videos.add(video);
		users.add(new User("Adriana", "Aroca", "777", videos));
		for (User u : users) 
			System.out.println(u.toString());
	}

}
