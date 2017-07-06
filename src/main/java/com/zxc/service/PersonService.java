package com.zxc.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.zxc.dao.PersonDao;
import com.zxc.entity.Person;

@Service
public class PersonService {
	
	private PersonDao personDao;
	public List<Person> getPerson(){
		return null;
	}
	
	public Person getPersonById(Integer id){
		return null;
	}
	
	public boolean addPerson(Person person){
		return true;
	}
	
	public boolean updatePerson(Person person){
		return true;
	}
	
	public boolean deletePerson(Person person){
		return true;
	}
	
	public boolean deletePersonById(Integer id){
		return true;
	}
	
}
