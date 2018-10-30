package tn.esprit.twin.ninja.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	protected int id;
	@Column(nullable = true)
	protected String last_name;
	@Column(nullable = true)
	protected String first_name;
	protected String note;
	protected String photo;
	protected boolean archived;
	protected UserType type;
	@Enumerated(EnumType.STRING)
	protected UserRoles role;
	protected String email;
    @OneToMany (mappedBy = "fromUser")
    protected Set<Conversation> sentCnversations = new HashSet<>();
	@OneToMany (mappedBy = "toUser")
	protected Set<Conversation> recievedConversations = new HashSet<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Conversation> getSentCnversations() {
		return sentCnversations;
	}

	public void setSentCnversations(Set<Conversation> sentCnversations) {
		this.sentCnversations = sentCnversations;
	}

	public Set<Conversation> getRecievedConversations() {
		return recievedConversations;
	}

	public void setRecievedConversations(Set<Conversation> recievedConversations) {
		this.recievedConversations = recievedConversations;
	}


	public User() {
		super();
	}

	public UserRoles getRole() {
		return role;
	}

	public void setRole(UserRoles role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}



}
