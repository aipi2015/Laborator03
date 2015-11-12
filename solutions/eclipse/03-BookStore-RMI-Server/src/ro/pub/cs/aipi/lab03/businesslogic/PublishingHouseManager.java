package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.PublishingHouse;

public class PublishingHouseManager extends PersistentEntityManager<PublishingHouse> {

	public PublishingHouseManager() {
		super(PublishingHouse.class);
	}

}
