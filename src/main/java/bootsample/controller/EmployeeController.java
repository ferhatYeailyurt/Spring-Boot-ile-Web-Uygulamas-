package bootsample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.HttpServletBean;

import bootsample.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService emloyeService;
	
	@GetMapping("/")
	public String test(HttpServletRequest request)
	{
		request.setAttribute("employes", emloyeService.findAll());
		return "index";
	}

}
