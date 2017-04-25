package bootsample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HttpServletBean;

import bootsample.model.Employe;
import bootsample.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService emloyeService;
	
	@GetMapping("/")
	public String home(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/all-employee")
	public String allEmployee(HttpServletRequest request)
	{
		request.setAttribute("employes", emloyeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	
	@GetMapping("/new-employee")
	public String newEmployee(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-employee")
	public String saveEmployee(@ModelAttribute Employe employe,BindingResult bindingResult,HttpServletRequest request)
	{
		emloyeService.save(employe);
		request.setAttribute("employes", emloyeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-task")
	public String updateEmployee(@RequestParam int id,HttpServletRequest request)
	{
		request.setAttribute("task", emloyeService.findEmployee(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-employee")
	public String deleteEmployee(@RequestParam int id,HttpServletRequest request)
	{
		emloyeService.delete(id);
		request.setAttribute("employes", emloyeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}   


	
	

	


}
