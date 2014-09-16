package ar.edu.info.lifia.grupo4.model;

import java.util.Collection;

public class GroupUser {

	private Long id;
	private String name;
	private Collection<User> integrants;

	public GroupUser() {
	}

	public GroupUser(String name, Collection<User> integrants) {
		super();
		this.name = name;
		this.integrants = integrants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<User> getIntegrants() {
		return integrants;
	}

	public void setIntegrants(Collection<User> integrants) {
		this.integrants = integrants;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
