package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.AlbumDao;
import com.ibm.entity.Album;

public class TestAlbumDao {

	private static AlbumDao dao;
	
	@BeforeAll
	public static void setup()
	{
		dao = new AlbumDao();
	}
	
	@Test
	public void testAdd()
	{
		Album a = new Album();
		a.setTitle("Rockstar");
		a.setGenre("Rock");
		a.setRating(4.0);
		assertNotEquals(0,dao.saveAlbum(a));
	}
	
	@Test
	public void testFind()
	{
		Album a = dao.findAlbum(1);
		assertNotNull(a);
		System.out.println(a.getTitle() + "  " +a.getRating());
	}
	
	
	
}
