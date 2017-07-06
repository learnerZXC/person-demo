package com.zxc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zxc.entity.Person;

@Repository
public class PersonDao {
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
