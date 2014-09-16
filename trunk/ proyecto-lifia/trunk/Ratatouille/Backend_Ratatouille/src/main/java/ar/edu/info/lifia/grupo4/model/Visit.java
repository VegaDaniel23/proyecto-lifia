package ar.edu.info.lifia.grupo4.model;

import java.util.Date;

public class Visit {

	private long id;
	private User cliente;
	private Restaurant restaurant;
	private Date date;

	public Visit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visit(User user, Restaurant restaurant, Date date) {
		super();
		this.cliente = user;
		this.restaurant = restaurant;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getCliente() {
		return cliente;
	}

	public void setCliente(User cliente) {
		this.cliente = cliente;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
