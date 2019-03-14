package domain;

import java.util.ArrayList;
import java.util.List;

public class Video {
	private String url;
	private String title;
	private List<String> tags;
	
	
	
	public Video(String url, String title, List<String> tags) {
		this.url = url;
		this.title = title;
		this.tags = tags;
	}

	public Video(String url, String title) {
		this(url, title, new ArrayList<String>());
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTags() {
		StringBuilder sbTags = new StringBuilder();
		for (String tag : this.tags) sbTags.append(tag + '\n');
		return sbTags.toString();
	}
	
	public void setTag(String tag) {
		this.tags.add(tag.replace(' ', '_'));
	}
	
	public void setTags(List<String> tags) {
		for (String tag : tags) setTag(tag);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("URL " + url + '\n');
		sb.append("Title: " + title + '\n');
		sb.append("Tags:\n");
		sb.append(getTags());
		return sb.toString();
	}
	
	
}
