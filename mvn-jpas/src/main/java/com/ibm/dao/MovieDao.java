package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MovieDao {
	
	private EntityManagerFactory factory;
	
	public MovieDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
		}

	public int addMultiplex(Multiplex m)
	{

		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
		return m.getMpexid();
		
	}
	 public int addMovie(Movie m)
	 {

			EntityManager em = factory.createEntityManager();
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.persist(m);
			txn.commit();
			em.close();
			return m.getMov_id();
		 
	 }
	 public boolean addMovieToMultiplex(int movid,int mpexid)
	 {
		EntityManager em = null;
		EntityTransaction txn = null;
		try
		{
			em = factory.createEntityManager();
			txn = em.getTransaction();
			txn.begin();
			Movie mov = em.find(Movie.class, mpexid);
			Multiplex mpex = em.find(Multiplex.class,movid);
			mov.getMultiplexes().add(mpex);
			txn.commit();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			txn.rollback();
			return false;
		}finally {
			em.close();
		}
     }
	 public Multiplex findMultiplex(int mpexid)
	 {
		EntityManager em = factory.createEntityManager();
		Multiplex mpex = em.find(Multiplex.class, mpexid);
		return mpex;
		 
	 }
	 public Movie findMovie(int movid)
	 {
		 EntityManager em = factory.createEntityManager();
			Movie mov = em.find(Movie.class, movid);
			return mov;
	 }
	 
	 
	 
	 
	 
	 
	 
}
