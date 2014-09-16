package ar.edu.info.lifia.grupo4.model;

public class RoleStandar extends AbstractRole{
	
	private Long id;
	private User user;

	
	public RoleStandar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}