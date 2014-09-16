package ar.edu.info.lifia.grupo4.model;

import java.util.Collection;

public class Restaurant {

	private Long id;
	private String name;
	private User owner;
	private Collection<Vote> votes;
	private Collection<Comment> comments;
	private Collection<Visit> Visits;

	public Restaurant() {
	}

	public Restaurant(String name, User owner, Collection<Vote> votes,
			Collection<Comment> comments, Collection<Visit> visits) {
		super();
		this.name = name;
		this.owner = owner;
		this.votes = votes;
		this.comments = comments;
		Visits = visits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Vote> getVotes() {
		return votes;
	}

	public void setVotes(Collection<Vote> votes) {
		this.votes = votes;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	public Collection<Visit> getVisits() {
		return Visits;
	}

	public void setVisits(Collection<Visit> visits) {
		Visits = visits;
	}

}
