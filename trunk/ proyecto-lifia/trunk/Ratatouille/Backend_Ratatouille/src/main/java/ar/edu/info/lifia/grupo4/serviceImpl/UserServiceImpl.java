package ar.edu.info.lifia.grupo4.serviceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.info.lifia.grupo4.dao.GenericDAO;
import ar.edu.info.lifia.grupo4.model.RoleStandar;
import ar.edu.info.lifia.grupo4.model.User;
import ar.edu.info.lifia.grupo4.model.Visitor;
import ar.edu.info.lifia.grupo4.service.UserService;

public class UserServiceImpl implements UserService {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"spring/context/appContext.xml");
	private User user;
	
	public void createUser(String dni, String lastName, String name){
		this.getUser().setDni(dni);
		this.getUser().setLastName(lastName);
		this.getUser().setName(name);
		this.getUser().setCategory(new Visitor());
		this.getUser().setRole(new RoleStandar());
		GenericDAO gDAO = context.getBean(GenericDAO.class);
		gDAO.save(this.getUser());	
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
