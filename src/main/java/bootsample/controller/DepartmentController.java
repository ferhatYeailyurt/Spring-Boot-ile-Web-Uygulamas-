package bootsample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bootsample.model.Deparment;
import bootsample.service.DeparmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DeparmentService deparmentService;
	
	
	@GetMapping("/all-department")
	public String allDepartment(HttpServletRequest request)
	{
		request.setAttribute("departments", deparmentService.findAll());
		request.setAttribute("mode", "MODE_TASKS_DEP");
		return "index";
	}
	
	
	@GetMapping("/new-department")
	public String newDepartment(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_NEW_DEP");
		return "index";
	}
	
	@PostMapping("/save-department")
	public String saveDepartment(@ModelAttribute Deparment deparment,BindingResult bindingResult,HttpServletRequest request)
	{
		deparmentService.save(deparment);
		request.setAttribute("departments", deparmentService.findAll());
		request.setAttribute("mode", "MODE_TASKS_DEP");
		return "index";
	}
	
	@GetMapping("/update-department")
	public String updateDepartment(@RequestParam int id,HttpServletRequest request)
	{
		request.setAttribute("task", deparmentService.findDepartment(id));
		request.setAttribute("mode", "MODE_UPDATE_DEP");
		return "index";
	}
	
	@GetMapping("/delete-department")
	public String deleteDepartment(@RequestParam int id,HttpServletRequest request)
	{
		deparmentService.delete(id);
		request.setAttribute("departments", deparmentService.findAll());
		request.setAttribute("mode", "MODE_TASKS_DEP");
		return "index";
	}   

}
