package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import bootsample.dao.EmployeeRepository;
import bootsample.model.Employe;

@Service
@Transactional
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
	    this.employeeRepository = employeeRepository;
	}
	
	public List<Employe> findAll()
	{
		List<Employe> emList= new ArrayList<>();
		for(Employe entities: employeeRepository.findAll())
		{
			emList.add(entities);
		}
		return emList;
		
	}
	
	public void save(Employe employe)
	{
		employeeRepository.save(employe);
	}
	
	public void delete(int id)
	{
		employeeRepository.delete(id);
	}
	
	public Employe findEmployee(int id)
	{
		return employeeRepository.findOne(id);
	}
	

}
