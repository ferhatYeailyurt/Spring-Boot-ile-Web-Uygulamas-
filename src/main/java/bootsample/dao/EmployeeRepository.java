package bootsample.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.core.CrudMethods;

import bootsample.model.Employee;


public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

}
