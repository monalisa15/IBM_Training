package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "movies")
@SequenceGenerator(name = "movseq", sequenceName ="seq_movie",initialValue = 101)
public class Movie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="movseq")
	@Column(name = "mov_id")
	private int mov_id;
	@Column(length =30)
	private String title;
	private double rating;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "show_time" ,joinColumns = {@JoinColumn(name = "mov_id")},
				inverseJoinColumns = {@JoinColumn(name = "mpex_id")})
	
	private Set<Multiplex> multiplexes = new HashSet<Multiplex>();

	public int getMov_id() {
		return mov_id;
	}

	public void setMov_id(int mov_id) {
		this.mov_id = mov_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Multiplex> getMultiplexes() {
		return multiplexes;
	}

	public void setMultiplexes(Set<Multiplex> multiplexes) {
		this.multiplexes = multiplexes;
	}
	
	
	
	
	

}
