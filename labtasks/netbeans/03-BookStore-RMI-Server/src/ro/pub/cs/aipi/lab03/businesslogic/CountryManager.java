package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.Country;

public class CountryManager extends PersistentEntityManager<Country> {

	public CountryManager() {
		super(Country.class);
	}

}
