package bootsample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import bootsample.controller.DepartmentRestController;

@Entity(name="meetingsdtable")
public class Meetings implements Serializable{
	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	
	public Meetings() {
		
	}
	public Meetings(String name, String description, List<Deparment> deparments) {
		super();
		this.name = name;
		this.description = description;
		this.deparments = deparments;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_deparment_id")
	private List<Deparment> deparments;
	
	@Override
	public String toString() {
		return "Meetings [id=" + id + ", name=" + name + ", description=" + description + ", deparment=" + deparments.get(0).getId()
				+ "]";
	}
	
	
	public List<Deparment> getDeparments() {
		return deparments;
	}
	public void setDeparment(Deparment deparment) {
		this.deparments = deparments;
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
	
	public void addDepartman(Deparment deparment){
		this.deparments.add(deparment);
	}
	public Meetings( String name, String description, Deparment deparment) {
		super();
		deparments = new ArrayList<Deparment>();
		this.name = name;
		this.description = description;
		addDepartman(deparment);
	}


	
	

}
