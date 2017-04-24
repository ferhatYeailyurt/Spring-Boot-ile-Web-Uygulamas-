package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.MeetingsRepository;
import bootsample.model.Deparment;
import bootsample.model.Meetings;

@Service
@Transactional
public class MeetingsSerrvice {
	
	private final MeetingsRepository meetingsRepository;

	public MeetingsSerrvice(MeetingsRepository meetingsRepository) {
		this.meetingsRepository = meetingsRepository;
	}
	
	public List<Meetings> findAll()
	{
		List<Meetings> emList= new ArrayList<>();
		for(Meetings entities: meetingsRepository.findAll())
		{
			emList.add(entities);
		}
		return emList;
		
	}
	
	public void save(Meetings meetings)
	{
		meetingsRepository.save(meetings);
	}
	//
	public void delete(int id)
	{
		meetingsRepository.delete(id);
	}

}
