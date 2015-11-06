package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.User;

public class UserManager extends PersistentEntityManager<User> {

	public UserManager() {
		super(User.class);
	}

}
