package lk.ac.vau.fas.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.myapp.model.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/app")
public class AppController {

    Student Bob = new Student("2020IT01","Bob Marely",23,"IT",3.2);
	Student Amal = new Student("2020IT02","Amal Perera",24,"AMC",3.7);
	Student Nimal = new Student("2020IT03","Nimal Hettiarachchi",22,"IT",3.0);

    @GetMapping("msg")
    public String myMessage() {
        return "Hello SpringBoot";
    }
    @GetMapping("/name")
	public String myName() {
		return "My name is SpringBoot";
	}
    @GetMapping("/age/{ag}")
	public String MyAge(@PathVariable("ag") int age) {
		return "My age is "+age;
	}
    
}
