package com.pack.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.entity.Student;
import com.pack.model.StudentBean;
import com.pack.repository.StudentRepository;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepository repo;

	@GetMapping("/home")
	public String getHomePage()
	{
		return "home";
	}

	@GetMapping("/studentRegister")
	public String getRegisterPage(Model model)
	{
		StudentBean student=new StudentBean();
		model.addAttribute("estd",student);
		return "studentRegister";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("estd")StudentBean studentBean,Model model)
	{
		Student std=new Student();
		BeanUtils.copyProperties(studentBean, std);
		boolean flag=repo.existsById(std.getStudentid());
		if(flag==true)
		{
			model.addAttribute("message","Sorry Student already register");
			return "home";
		}
		else
		{
			repo.save(std);
			model.addAttribute("message","Student data added successfully");
			return "home";
		}
	}

	
	@GetMapping("/studentLogin")
	public String getLoginPage()
	{
		return "login";
	}
	
	@PostMapping("/loginStudent")
	public  String  checkLogin(@RequestParam Integer studentid, @RequestParam String studentname, Model model)
	{
		boolean flag=repo.existsById(studentid);
		if(flag==false) {
			model.addAttribute("msg", "Bad Credentials");
			return "error";
		}
		else {
			return  "loginSuccess";
		}
}

}