package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsample.model.Employe;
import bootsample.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService emloyeService;
	
	@GetMapping("/home")
	public String test()
	{
		return "test başarılı";
	}
	

	
	@GetMapping("/all-list")
	private String allEmployee()
	{
		return emloyeService.findAll().toString();
	}
	
	@GetMapping("/save-employee")
	public String saveEmloye(@RequestParam String name, @RequestParam String surname, @RequestParam int salary)
	{
		Employe employe=new Employe(name,surname,salary);
		emloyeService.save(employe);
		return "Employee saved.";
	}
	
	@GetMapping("/delete-employee")
	public String deleteEmloye(@RequestParam int id)
	{
		emloyeService.delete(id);
		return "Employee delete.";
	}

}
