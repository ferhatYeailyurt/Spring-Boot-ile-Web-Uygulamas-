package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import bootsample.dao.EmployeeRepository;
import bootsample.model.Employee;

@Service
@Transactional
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
	    this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> findAll()
	{
		List<Employee> emList= new ArrayList<>();
		for(Employee entities: employeeRepository.findAll())
		{
			emList.add(entities);
		}
		return emList;
		
	}
	
	public void save(Employee employe)
	{
		employeeRepository.save(employe);
	}
	
	public void delete(int id)
	{
		employeeRepository.delete(id);
	}
	

}
