package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.SupplyOrderLine;

public class SupplyOrderLineManager extends PersistentEntityManager<SupplyOrderLine> {

	public SupplyOrderLineManager() {
		super(SupplyOrderLine.class);
	}

}
