package com.zxc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.zxc.entity.Person;

@Controller
public class PersonController {
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
