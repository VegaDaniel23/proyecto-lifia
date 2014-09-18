package ar.edu.info.lifia.grupo4.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.info.lifia.grupo4.dao.GenericDAO;

public class DBLoader {

	static final Logger logger = LogManager.getLogger(DBLoader.class.getName());
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"spring/context/appContext.xml");

	public DBLoader() {
	}

	public static void main(String[] args) {
		try {
			
			// Creo una object properties...

			Properties info = new Properties();

			// Levanto el archivo DBData.properties con los datos y los envio
			// como parametros

			info.load(DBLoader.class.getResourceAsStream("/DBData.properties"));

			Restaurant restaurant = LoadRestaurant(info);
			
			// Persisto el restaurant creado
			GenericDAO gDAO = context.getBean(GenericDAO.class);
			gDAO.save(restaurant);

			logger.info("DONE.");
		} catch (Exception e) {
			logger.info("------------------------FAIL.------------------------");
			e.printStackTrace();
		}
	}

	private static Restaurant LoadRestaurant(Properties info)
			throws HibernateException, ParseException {

		// Creacion de un Usuarios con rol standar
		User u1 = CreateUser1(info);
		User u2 = CreateUser2(info);
		User u3 = CreateUser3(info);
		User u4 = CreateUser4(info);
		User u5 = CreateUser5(info);

		// Creacion de un Usuarios con rol responsable

		User u6 = CreateUser6(info);

		// Creacion de un Restaurant
		Restaurant restaurant = CreateRestaurant(u6, info);

		// Creacion de visitas
		Visit visit1 = CreateVisit1(u1, restaurant, info);
		Visit visit2 = CreateVisit2(u2, restaurant, info);
		Visit visit3 = CreateVisit3(u4, restaurant, info);
		Visit visit4 = CreateVisit4(u5, restaurant, info);
		Visit visit5 = CreateVisit5(u3, restaurant, info);

		// Creacion de un comentario positivo echo por un user standar
		Comment comment = CreateComment(u1, info);
		Positive votePositive = new Positive(u1);

		// Recomendacion del u1 al u2
		Recommendation recommendation = new Recommendation(u1, restaurant);
		u2.getRecommendations().add(recommendation);

		restaurant.getComments().add(comment);
		restaurant.getVotes().add(votePositive);
		restaurant.getVisits().add(visit1);
		restaurant.getVisits().add(visit2);
		restaurant.getVisits().add(visit3);
		restaurant.getVisits().add(visit4);
		restaurant.getVisits().add(visit5);

		return restaurant;
	}

	private static Visit CreateVisit5(User u, Restaurant restaurant,
			Properties info) throws ParseException {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dfm.parse(info.getProperty("date5"));
		Visit visit = new Visit(u, restaurant, date);
		u.getVisits().add(visit);
		restaurant.getVisits().add(visit);
		return visit;
	}

	private static Visit CreateVisit4(User u, Restaurant restaurant,
			Properties info) throws ParseException {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dfm.parse(info.getProperty("date4"));
		Visit visit = new Visit(u, restaurant, date);
		u.getVisits().add(visit);
		restaurant.getVisits().add(visit);
		return visit;
	}

	private static Visit CreateVisit3(User u, Restaurant restaurant,
			Properties info) throws ParseException {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dfm.parse(info.getProperty("date3"));
		Visit visit = new Visit(u, restaurant, date);
		u.getVisits().add(visit);
		restaurant.getVisits().add(visit);
		return visit;
	}

	private static Visit CreateVisit2(User u, Restaurant restaurant,
			Properties info) throws ParseException {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dfm.parse(info.getProperty("date2"));
		Visit visit = new Visit(u, restaurant, date);
		u.getVisits().add(visit);
		restaurant.getVisits().add(visit);
		return visit;
	}

	private static User CreateUser6(Properties info) {
		User u = new User(info.getProperty("dni6"),
				info.getProperty("last_name6"), info.getProperty("name6"), 0,
				new RoleResponsible(), new Visitor(), null, new HashSet<Recommendation>(), new HashSet<Visit>(), null);
		return u;
	}

	private static User CreateUser5(Properties info) {
		User u = new User(info.getProperty("dni5"),
				info.getProperty("last_name5"), info.getProperty("name5"), 0,
				new RoleStandar(), new Visitor(), null, new HashSet<Recommendation>(), new HashSet<Visit>(), null);
		return u;
	}

	private static User CreateUser4(Properties info) {
		User u = new User(info.getProperty("dni4"),
				info.getProperty("last_name4"), info.getProperty("name4"), 0,
				new RoleStandar(), new Visitor(), null, new HashSet<Recommendation>(), new HashSet<Visit>(), null);
		return u;
	}

	private static Visit CreateVisit1(User u, Restaurant restaurant,
			Properties info) throws ParseException {
		// TODO Auto-generated method stub
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dfm.parse(info.getProperty("date1"));
		Visit visit = new Visit(u, restaurant, date);
		u.getVisits().add(visit);
		restaurant.getVisits().add(visit);
		return visit;
	}

	private static User CreateUser3(Properties info) {
		// TODO Auto-generated method stub
		User u = new User(info.getProperty("dni3"),
				info.getProperty("last_name3"), info.getProperty("name3"), 0,
				new RoleStandar(), new Visitor(), null, new HashSet<Recommendation>(), new HashSet<Visit>(), null);
		return u;
	}

	private static Comment CreateComment(User u, Properties info)
			throws ParseException {
		// TODO Auto-generated method stub
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dfm.parse(info.getProperty("date1"));

		Comment comment = new Comment(u, info.getProperty("comment1"), date);
		u.updateScore(1);
		return comment;
	}

	private static Restaurant CreateRestaurant(User u, Properties info) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant(info.getProperty("rest_name1"),
				u, null, new HashSet<Vote>(), new HashSet<Comment>(),
				new HashSet<Visit>());
		return restaurant;
	}

	private static User CreateUser1(Properties info) {
		// TODO Auto-generated method stub
		User u = new User(info.getProperty("dni1"),
				info.getProperty("last_name1"), info.getProperty("name1"), 0,
				new RoleStandar(), new Visitor(), null, new HashSet<Recommendation>(), new HashSet<Visit>(), null);

		return u;
	}

	private static User CreateUser2(Properties info) {
		// TODO Auto-generated method stub
		User u = new User(info.getProperty("dni2"),
				info.getProperty("last_name2"), info.getProperty("name2"), 0,
				new RoleStandar(), new Visitor(), null, new HashSet<Recommendation>(), new HashSet<Visit>(), null);

		return u;
	}

}
