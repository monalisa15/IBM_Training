package com.ibm.entity;

import javax.persistence.*;

@Entity
@Table(name ="music_album")

public class Album {
	@Id
	@GeneratedValue
	@Column(name ="album_id")
	private int album_id;
	
	@Column(length =20)
	private String title;
	
	@Column(length = 10)
	private String genre;
	
	private double rating;
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	

}
