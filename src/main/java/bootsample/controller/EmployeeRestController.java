package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bootsample.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@GetMapping("/home")
	public String test()
	{
		return "test başarılı";
	}
	
	@Autowired
	private EmployeeService emloyeService;
	
	@GetMapping("/all-list")
	private String allEmployee()
	{
		return emloyeService.findAll().toString();
	}
	

}
