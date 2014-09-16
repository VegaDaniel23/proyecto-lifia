package ar.edu.info.lifia.grupo4.model;

public class Recommendation {

	private Long id;
	private User owner;
	private Restaurant restaurant;
	
	public Recommendation() {
	}

	public Recommendation(User owner, Restaurant restaurant) {
		super();
		this.owner = owner;
		this.restaurant = restaurant;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

