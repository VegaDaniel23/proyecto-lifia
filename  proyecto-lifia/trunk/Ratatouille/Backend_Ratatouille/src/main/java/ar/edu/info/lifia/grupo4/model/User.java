package ar.edu.info.lifia.grupo4.model;

import java.util.Collection;

public class User {

	private Long id;
	private String dni;
	private String lastName;
	private String name;
	private int score;
	private AbstractRole role;
	private UserCategory category;
	private AdminVotes adminVotes;
	private Collection<GroupUser> groups;
	private Collection<Recommendation> recommendations;
	private Collection<Visit> visits;
	private Restaurant restaurant;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String dni, String lastName, String name, int score,
			AbstractRole role, UserCategory category, AdminVotes adminVotes,
			Collection<GroupUser> groups,
			Collection<Recommendation> recommendations,
			Collection<Visit> visits, Restaurant restaurant) {
		super();
		this.dni = dni;
		this.lastName = lastName;
		this.name = name;
		this.score = score;
		this.role = role;
		this.category = category;
		this.adminVotes = adminVotes;
		this.groups = groups;
		this.recommendations = recommendations;
		this.visits = visits;
		this.restaurant = restaurant;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Collection<GroupUser> getGroups() {
		return groups;
	}

	public void setGroups(Collection<GroupUser> groups) {
		this.groups = groups;
	}

	public Collection<Recommendation> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(Collection<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserCategory getCategory() {
		return category;
	}

	public void setCategory(UserCategory category) {
		this.category = category;
	}

	public void updateScore(int score) {

		this.score = this.score + score;
	}

	public Collection<Visit> getVisits() {
		return visits;
	}

	public void setVisits(Collection<Visit> visits) {
		this.visits = visits;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public AbstractRole getRole() {
		return role;
	}

	public void setRole(AbstractRole role) {
		this.role = role;
	}

	public AdminVotes getAdminVotes() {
		return adminVotes;
	}

	public void setAdminVotes(AdminVotes adminVotes) {
		this.adminVotes = adminVotes;
	}

}
