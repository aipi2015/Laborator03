package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.SupplyOrderHeader;

public class SupplyOrderHeaderManager extends PersistentEntityManager<SupplyOrderHeader> {

	public SupplyOrderHeaderManager() {
		super(SupplyOrderHeader.class);
	}

}
