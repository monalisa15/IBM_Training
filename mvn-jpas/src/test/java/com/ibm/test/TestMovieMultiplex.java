package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MovieDao;
import com.ibm.entity.Employee;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestMovieMultiplex {
	
	private static MovieDao mdao;
	

	@BeforeAll
	public static void setup()
	{
		mdao = new MovieDao();
	}
	
	@Test
	public void testMovieAdd()
	{
		Movie m = new Movie();
		m.setTitle("JUDWAA");
		m.setRating(5);
		int mid = mdao.addMovie(m);
		System.out.println(mid);
	}
	@Test
	public void testMultiplexAdd()
	{
		Multiplex m = new Multiplex();
		m.setName("INOX");
		m.setCity("CTC");
		int mid =mdao.addMultiplex(m);
		System.out.println(mid);
	}
	
	@Test
	public void testAddMovToMpx()
	{
		assertTrue(mdao.addMovieToMultiplex(152,1102));
	}
	
	@Test
	public void testFindMultiplex()
	{
		 Multiplex m = mdao.findMultiplex(1102);
		 assertNotNull(m);
		 System.out.println(m.getMovies());
		 
	}
	@Test
	public void testFindMovie()
	{
		 Movie m = mdao.findMovie(152);
		 assertNotNull(m);
		 System.out.println(m.getTitle());
		 
	}

}
