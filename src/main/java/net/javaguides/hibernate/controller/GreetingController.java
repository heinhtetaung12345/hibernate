package net.javaguides.hibernate.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.entity.Greeting;
import net.javaguides.hibernate.entity.Student;

@Controller
public class GreetingController {
	StudentDao studentDao=new StudentDao();
	
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
    
    
    @GetMapping("/student")
    public String showStudent(Model model){
    	List<Student> students=studentDao.getStudent();
    	model.addAttribute("students",students);
    	return "student";
    }
    
    @GetMapping("/create-student")
    public String createStudent(Model model){
    	model.addAttribute("student", new Student());
    	return "create-student";
    }
    
    @PostMapping("/student")
    public String showStudent(@ModelAttribute Student student){
    	studentDao.saveStudent(student);
    	return "student";
    }
    
    
    
}
