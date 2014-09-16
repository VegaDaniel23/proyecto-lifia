package ar.edu.info.lifia.grupo4.model;

public abstract class AbstractAction {
	
	private Long id;

	public AbstractAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void execute (User u){
		
	};
	
}
