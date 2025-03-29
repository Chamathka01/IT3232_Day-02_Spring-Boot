package lk.ac.vau.fas.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.myapp.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/app")
public class AppController {

    Student Bob = new Student("2020IT01","Bob Marely",23,"IT",3.2);
	Student Amal = new Student("2020IT02","Amal Perera",24,"AMC",3.7);
	Student Nimal = new Student("2020IT03","Nimal Hettiarachchi",22,"IT",3.0);
    List<Student> students = new ArrayList<Student>();

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
    //a method to return a student
    @GetMapping("/student")
	public Student getStudent() {
		return Nimal;
	}
    //return multiple students
    @GetMapping("/students")
	public List<Student> getStudents() {
		students.add(Bob);
		students.add(Amal);
		students.add(Nimal);
		return students;
	}
    //find a student from the list by regno
    @GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") String regno) {
		for(Student student : students) {
			if(student.getRegNo().equals(regno)) {
				return student;
			}
		}	
		return null;
    
}
