package ar.edu.info.lifia.grupo4.model;

import java.util.Date;

public class Comment {

	private Long id;
	private User author;
	private String description;
	private Date date;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(User author, String description, Date date) {
		super();
		this.author = author;
		this.description = description;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
