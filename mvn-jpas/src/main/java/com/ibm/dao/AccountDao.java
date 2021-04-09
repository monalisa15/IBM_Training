package com.ibm.dao;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	import com.ibm.entity.Account;

public class AccountDao {
	
		private EntityManagerFactory factory;
		public AccountDao() {
			factory = Persistence.createEntityManagerFactory("MyJPA");
		}
		
		
		public int saveAccount(Account a)
		{
			
			EntityManager em = factory.createEntityManager();
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.persist(a);
			txn.commit();
			em.close();
			return a.getAccount_no();
		}

		
	}
