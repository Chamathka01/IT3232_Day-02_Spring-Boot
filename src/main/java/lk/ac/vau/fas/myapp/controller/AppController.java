package lk.ac.vau.fas.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/app")
public class AppController {
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
