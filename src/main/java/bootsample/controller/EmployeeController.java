package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bootsample.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService emloyeService;
	
	@GetMapping("/home1")
	public String test()
	{
		return "index";
	}

}
