package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		PanCard card=new PanCard();
		card.setPanNumber("12abc34");
		card.setAddress("Bangalore");
		
		Person person=new Person();
		person.setPersonName("Sooraj");
		
		person.setPan(card);
		
		entityTransaction.begin();
		entityManager.persist(card);
	    entityManager.persist(person);	
		entityTransaction.commit();

	}

}
