package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	private String name;
	private String surName;
	private String password;
	private Date dateOfRegistre;
	private List<Video> videos;
	
	
	
	public User(String name, String surName, String password, List<Video> videos) {
		this.name = name;
		this.surName = surName;
		this.password = password;
		this.dateOfRegistre = new Date();
		this.videos = videos;
	}

	public User(String name, String surName, String password) {
		this(name, surName, password, new ArrayList<Video>());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVideos() {
		StringBuilder sb = new StringBuilder();
		for (Video video : this.videos) sb.append(video.toString() + '\n');
		return sb.toString();
	}
	
	public void setVideos(List<Video> videos) {
		for (Video video : videos) setVideo(video);
	}
	
	public void setVideo(Video video) {
		this.videos.add(video);
	}
	
	public Date getDateOfRegistre() {
		return dateOfRegistre;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User: " + name + ' ' + surName + '\t' + dateOfRegistre +'\n');
		sb.append(getVideos());
		return sb.toString();
	}

	
}
