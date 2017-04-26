package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.DeparmentRepository;
import bootsample.model.Deparment;
import bootsample.model.Employe;

@Service
@Transactional
public class DeparmentService {
	
	private final DeparmentRepository deparmentRepository;

	public DeparmentService(DeparmentRepository deparmentRepository) {
		this.deparmentRepository = deparmentRepository;
	}
	
	public List<Deparment> findAll()
	{
		List<Deparment> emList= new ArrayList<>();
		for(Deparment entities: deparmentRepository.findAll())
		{
			emList.add(entities);
		}
		return emList;
		
	}
	
	public void save(Deparment deparment)
	{
		deparmentRepository.save(deparment);
	}
	//
	public void delete(int id)
	{
		deparmentRepository.delete(id);
	}
	public Deparment findEmployee(int id)
	{
		return deparmentRepository.findOne(id);
	}
	

}
