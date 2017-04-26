package bootsample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bootsample.model.Employe;
import bootsample.model.Meetings;
import bootsample.service.EmployeeService;
import bootsample.service.MeetingsSerrvice;

@Controller
public class MeetingsController {
	
	@Autowired
	private MeetingsSerrvice meetingsSerrvice;
	
	@GetMapping("/all-meetings")
	public String allMeetings(HttpServletRequest request)
	{
		request.setAttribute("meetings", meetingsSerrvice.findAll());
		request.setAttribute("mode", "MODE_TASKS_MEE");
		return "index";
	}
	
	
	@GetMapping("/new-meetings")
	public String newMeetings(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_NEW_MEE");
		return "index";
	}
	
	@PostMapping("/save-meetings")
	public String saveMeetings(@ModelAttribute Meetings meetings,BindingResult bindingResult,HttpServletRequest request)
	{
		meetingsSerrvice.save(meetings);
		request.setAttribute("meetings", meetingsSerrvice.findAll());
		request.setAttribute("mode", "MODE_TASKS_MEE");
		return "index";
	}
	
	@GetMapping("/update-meetings")
	public String updateMeetings(@RequestParam int id,HttpServletRequest request)
	{
		request.setAttribute("task", meetingsSerrvice.findMeetings(id));
		request.setAttribute("mode", "MODE_UPDATE_MEE");
		return "index";
	}
	
	@GetMapping("/delete-meetings")
	public String deleteMeetings(@RequestParam int id,HttpServletRequest request)
	{
		meetingsSerrvice.delete(id);
		request.setAttribute("meetings", meetingsSerrvice.findAll());
		request.setAttribute("mode", "MODE_TASKS_MEE");
		return "index";
	}   



}
