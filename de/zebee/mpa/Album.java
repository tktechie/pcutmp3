package de.zebee.mpa;

import java.util.ArrayList;

public class Album {
	
	String performer;
	String title;
	ArrayList<Track> tracks;
	
	public Album(String performer, String title, String album) {
		this.performer = performer;
		this.title = title;
	}
	
	public Album() {
		
	}
	
	public String getPerformer() {
		return this.performer;
	}
	
	public String getTitle() {
		return this.title;
	}
		
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addTrack(Track t) {
		tracks.add(t);
	}
	
	public Track getTrack(int trackNumber) {
		return tracks.get(trackNumber);
	}

}
