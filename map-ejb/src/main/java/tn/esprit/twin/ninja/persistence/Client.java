package tn.esprit.twin.ninja.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GenerationType;
import tn.esprit.twin.ninja.persistence.Request;

enum clientCategory {
	privateCat, publicCat;
}

enum clientType {
	currentClient, newClient, finishedContract;
}

@Entity
public class Client extends User implements Serializable {
	private String name;
	@Enumerated(EnumType.STRING)
	private clientCategory category;
	@Enumerated(EnumType.STRING)
	private clientType type;
	private String Logo;
	private Float Latitude ;
	private Float Longitude ;
	@JsonIgnore
	@ManyToMany
	private List<Request> requests;
	@JsonIgnore
	@OneToMany(mappedBy="client")
	private List<Project> projects;
	
	public List<Request> getRequests() {
		return requests;
	}
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public clientCategory getCategory() {
		return category;
	}
	public void setCategory(clientCategory category) {
		this.category = category;
	}
	public clientType getType() {
		return type;
	}
	public void setType(clientType type) {
		this.type = type;
	}
	public String getLogo() {
		return Logo;
	}
	public void setLogo(String logo) {
		Logo = logo;
	}
	public Float getLatitude() {
		return Latitude;
	}
	public void setLatitude(Float latitude) {
		Latitude = latitude;
	}
	public Float getLongitude() {
		return Longitude;
	}
	public void setLongitude(Float longitude) {
		Longitude = longitude;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	
	
}
	