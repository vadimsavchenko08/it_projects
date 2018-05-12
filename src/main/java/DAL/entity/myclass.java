package DAL.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class myclass {
	static Logger LOG = LogManager.getLogger(myclass.class);
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		Class group = new Class();
//		group.setName("KIT26V");
//		User user = new User();
//		user.setActive(true);
//		user.setBudget(true);
//		user.setEmail("gatanuknatalia@ukr.net");
//		user.setFaculty("KIT");
//		user.setFirstName("Nataliya");
//		user.setGroup(group);
//		user.setLogin("Gatanuk"+group.getName());
//		user.setPassword("123");
//		user.setRole(Role.STAROSTA);
//		user.setSecondName("Gatanuk");
//		session.save(group);
//		session.save(user);
//		User user = session.get(User.class,3);
//		System.out.println(user);
//		transaction.commit();
		
		
		LOG.debug("HELLO WORLD\n\n\n\n\n\n\n\n\n");
		session.close();
		factory.close();
	}
}
