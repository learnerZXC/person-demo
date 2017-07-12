package com.zxc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
		List<Person> lp =this.getSession().createCriteria(Person.class).list();
		return lp;
	}
	
	public Person getPersonById(Integer id){
		return (Person)this.getSession().createQuery("from Person where id=?").setParameter(0, id).uniqueResult();
	}
	
	public void addPerson(Person person){
		this.getSession().save(person);
	}
	
	public void updatePerson(Person person){
		this.getSession().update(person);
	}
	
	public int deletePersonById(Integer id){
		return this.getSession().createQuery("delete Person where id=?").setParameter(0, id).executeUpdate();
	}
	
}
