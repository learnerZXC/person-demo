package com.zxc.controller;

import java.util.List;
import java.util.Objects;

import javax.security.auth.login.LoginContext;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxc.entity.Person;
import com.zxc.service.PersonService;

@Controller
@RequestMapping(value="/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/login")
	public String Login(){
		return "login";
	}
	
	@RequestMapping(value="/doLogin")
	public String doLogin(String userName,String password){
		if(Objects.equals(userName, "")&&Objects.equals(password, "")){
			return "redirect:main";
		}
		return "redirect:login";
	}
	
	@RequestMapping(value="/main")
	public String main(Model model){
		model.addAttribute("person",this.personService.getPersons());
		return"main";
	}
	
	@RequestMapping(value="/addPrompt")
	public String addPrompt(){
		return "addPrompt";
	}
	
	@RequestMapping(value="/updatePrompt")
	public String updatePrompt(Model model,Integer id){
		model.addAttribute("person",this.personService.getPersonById(id));
		return"updatePrompt";
	}
	
	@RequestMapping(value="/getPerson")
	@ResponseBody
	public List<Person> getPersons(){
		return personService.getPersons();
	}
	
	@RequestMapping(value="/getPersonById")
	@ResponseBody
	public Person getPersonById(Integer id){
		return personService.getPersonById(id);
	}
	
	@RequestMapping(value="/addPerson")
	public String addPerson(Person person){
		personService.addPerson(person);
		return "redirect:main";
	}
	
	@RequestMapping(value="/updatePerson")
	public String updatePerson(Person person){
		personService.updatePerson(person);
		return "redirect:main";
	}
	
	@RequestMapping(value="/deletePersonById")
	public String deletePersonById(Integer id){
		personService.deletePersonById(id);
		return "redirect:main";
	}
	
}
