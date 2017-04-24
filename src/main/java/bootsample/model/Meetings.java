package bootsample.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="meetingsdtable")
public class Meetings implements Serializable{
	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	
	public Meetings() {
		
	}
	public Meetings(String name, String description, Deparment deparment) {
		super();
		this.name = name;
		this.description = description;
		this.deparment = deparment;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_deparment_id")
	private Deparment deparment;
	
	@Override
	public String toString() {
		return "Meetings [id=" + id + ", name=" + name + ", description=" + description + ", deparment=" + deparment
				+ "]";
	}
	
	
	public Deparment getDeparment() {
		return deparment;
	}
	public void setDeparment(Deparment deparment) {
		this.deparment = deparment;
	}
	
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	
	

}
