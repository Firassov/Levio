package tn.esprit.twin.ninja.persistence.recruitment;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import tn.esprit.twin.ninja.persistence.Ressource;

@Entity
@Table
public class Letter implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	private StateLetter stateLetter;
	private String contratType;
	private float salary;
	@OneToOne(mappedBy="letterEmpUser",cascade=CascadeType.PERSIST)
	private Folder folder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StateLetter getStateLetter() {
		return stateLetter;
	}
	public void setStateLetter(StateLetter stateLetter) {
		this.stateLetter = stateLetter;
	}
	public String getContratType() {
		return contratType;
	}
	public void setContratType(String contratType) {
		this.contratType = contratType;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Letter(String contratType, float salary) {
		super();
		this.contratType = contratType;
		this.salary = salary;
	}
	public Letter() {
		super();
	}
	public Folder getFolder() {
		return folder;
	}
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	
	
	

}
