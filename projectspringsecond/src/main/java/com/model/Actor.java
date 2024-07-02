package com.model;

public class Actor {

	private int actorId;
	private String actorName;
	
	private Movie movie;
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Actor() {
		super();
	}
	public Actor(int actorId, String actorName) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
	}
	
	
	public Actor(int actorId, String actorName, Movie movie) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.movie = movie;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	
	
}
