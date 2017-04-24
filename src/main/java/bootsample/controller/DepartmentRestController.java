package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsample.model.Deparment;
import bootsample.model.Employe;
import bootsample.service.DeparmentService;
import bootsample.service.EmployeeService;

@RestController
public class DepartmentRestController {
	
	@Autowired
	private DeparmentService deparmentService;
	
	@GetMapping("/all-list-deparment")
	private String allEmployee()
	{
		return deparmentService.findAll().toString();
	}
	
	@GetMapping("/save-deparment")
	public String saveEmloye(@RequestParam String name,@RequestParam String description)
	{
		Deparment deparmant=new Deparment(name,description);
		deparmentService.save(deparmant);
		return "Deparment saved.";
	}
	
	@GetMapping("/delete-deparment")
	public String deleteEmloye(@RequestParam int id)
	{
		deparmentService.delete(id);
		return "Deparment delete.";
	}

}
