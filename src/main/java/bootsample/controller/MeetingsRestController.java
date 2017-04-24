package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsample.model.Deparment;
import bootsample.model.Employe;
import bootsample.model.Meetings;
import bootsample.service.DeparmentService;
import bootsample.service.MeetingsSerrvice;

@RestController
public class MeetingsRestController {
	
	@Autowired
	private MeetingsSerrvice meetingsSerrvice;
	
	@GetMapping("/all-list-meetings")
	private String allMeetings()
	{
		return meetingsSerrvice.findAll().toString();
	}
	
	@GetMapping("/save-meetings")
	public String saveEmloye(@RequestParam String name,@RequestParam String description, @RequestParam Deparment dep_id)
	{
		Meetings meetings=new Meetings(name,description,dep_id);
		meetingsSerrvice.save(meetings);
		return "Meetings saved.";
	}
	
	@GetMapping("/delete-meetings")
	public String deleteEmloye(@RequestParam int id)
	{
		meetingsSerrvice.delete(id);
		return "Meetings delete.";
	}

}
