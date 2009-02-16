package de.zebee.mpa;

public class Track {
	
	String performer;
	String title;
	String album;
	
	public Track(String performer, String title, String album) {
		this.performer = performer;
		this.title = title;
		this.album = album;
	}
	
	public Track() {
		
	}
	
	public String getPerformer() {
		return this.performer;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}

}
