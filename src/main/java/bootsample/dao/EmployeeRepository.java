package bootsample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import bootsample.model.Employe;

public interface EmployeeRepository  extends CrudRepository<Employe, Integer>{

	
	
}
