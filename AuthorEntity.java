package com.capgemini;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorEntity {
	public static void main(String[] args) {
		EntityManagerFactory factor= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factor.createEntityManager();
		
		
		Author author=new Author();
		
		
		Scanner sc= new Scanner(System.in);
		
		
		/*System.out.println("Enter the AuthorId ");
		int authorid=sc.nextInt();
		author.setAuthorId(authorid);
		
		
		System.out.println("Enter the FirstName");
		String firstName=sc.next();
		author.setFirstName(firstName);
		
		
		System.out.println("Enter the MiddleName");
		String middleName=sc.next();
		author.setMiddleName(middleName);
		
		
		
		System.out.println("Enter the LastName");
		String lastName=sc.next();
		author.setLastName(lastName);
		
		
		System.out.println("Enter the PhoneNo");
		int phoneNo=sc.nextInt();
		author.setPhoneNo(phoneNo);*/
		
		em.getTransaction().begin();
		//em.persist(author);// insert operation
		
		System.out.println("Enter the AuthorId");
		int id=sc.nextInt();
		Author author1=em.find(Author.class, id);// Read operation
		System.out.println(author1);
		
		
		System.out.println("Enter the AuthorId to be updated");
		int updateid=sc.nextInt();
		Author updateauthor=em.find(Author.class, updateid);
		updateauthor.setPhoneNo(954545454);//update operation
		
		System.out.println("Enter the AuthorId to be updated");
		int removeid=sc.nextInt();
		Author removeauthor=em.find(Author.class, updateid);
		em.remove(removeauthor);// remove operation
		
		
		
		em.getTransaction().commit();
	}

}
