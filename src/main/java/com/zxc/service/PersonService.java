package com.zxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxc.dao.PersonDao;
import com.zxc.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Transactional
	public List<Person> getPersons(){
		return personDao.getPersons();
	}
	
	@Transactional
	public Person getPersonById(Integer id){
		return personDao.getPersonById(id);
	}
	
	@Transactional
	public void addPerson(Person person){
		 personDao.addPerson(person);;
	}
	
	@Transactional
	public void updatePerson(Person person){
		 personDao.updatePerson(person);;
	}
	
	@Transactional
	public void  deletePersonById(Integer id){
		 personDao.deletePersonById(id);
	}
	
}
