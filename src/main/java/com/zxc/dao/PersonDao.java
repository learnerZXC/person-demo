package com.zxc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zxc.entity.Person;

@Repository
public class PersonDao {
	@Resource
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Person> getPersons(){
		return (List<Person>)this.getSession().createCriteria(Person.class).list();
	}
	
	public Person getPersonById(Integer id){
		return (Person)this.getSession().createQuery("from person where id=?").setParameter(0, id).uniqueResult();
	}
	
	public void addPerson(Person person){
		this.getSession().save(person);
	}
	
	public void updatePerson(Person person){
		this.getSession().update(person);
	}
	
	public int deletePersonById(Integer id){
		return this.getSession().createQuery("delete person where id=?").setParameter(0, id).executeUpdate();
	}
	
}
