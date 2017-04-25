package bootsample.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity(name="employedtable")
public class Employe implements Serializable {

	public Employe() {
		
	}
	
	public Employe(String name, String surname, int salary, Deparment dep) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.deparment=dep;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
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
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "salary")
	private int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_departmen_id")
	private Deparment deparment;
	public Deparment getDeparment() {
		return deparment;
	}

	public void setDeparment(Deparment deparment) {
		this.deparment = deparment;
	}
	
	

}
