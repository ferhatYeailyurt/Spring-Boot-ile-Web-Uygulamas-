package bootsample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity(name="employedtable")
public class Employe implements Serializable {

	public Employe() {
		
	}
	public Employe(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String name;
	private String surname;
	private int salary;
	
	

}
