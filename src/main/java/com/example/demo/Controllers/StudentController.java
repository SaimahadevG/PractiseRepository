package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bindings.Student;

@RestController
@RequestMapping("/student")
public class StudentController
{
	@GetMapping("/getStudentData")
	public Student getStudentData()
	{
		Student s =new Student();
		s.setSid(101);
		s.setSname("mahdev");
		s.setSaddress("hyderabad");
		
		return s;
	}

}
