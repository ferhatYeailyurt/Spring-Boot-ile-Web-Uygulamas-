package bootsample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import bootsample.model.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

}
