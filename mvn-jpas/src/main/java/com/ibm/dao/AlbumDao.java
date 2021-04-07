package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Album;

public class AlbumDao {
	
	private EntityManagerFactory factory;
	public AlbumDao() {
		// TODO Auto-generated constructor stub
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	
	public int saveAlbum(Album a)
	{
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(a);
		txn.commit();
		em.close();
		return a.getAlbum_id();
	}

	public Album findAlbum(int id)
	{
		EntityManager em = factory.createEntityManager();
		Album a= em.find(Album.class, id);
		return a;
	}
}
