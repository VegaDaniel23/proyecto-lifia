package ar.edu.info.lifia.grupo4.model;

public class Vote {

	private Long id;
	private User user;

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vote(User user) {
		super();
		this.user = user;
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
