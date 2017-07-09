package com.zxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zxc.dao.PersonDao;
import com.zxc.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	
	public List<Person> getPersons(){
		return personDao.getPersons();
	}
	
	public Person getPersonById(Integer id){
		return personDao.getPersonById(id);
	}
	
	public void addPerson(Person person){
		 personDao.addPerson(person);;
	}
	
	public void updatePerson(Person person){
		 personDao.updatePerson(person);;
	}
	
	public void  deletePersonById(Integer id){
		 personDao.deletePersonById(id);
	}
	
}
