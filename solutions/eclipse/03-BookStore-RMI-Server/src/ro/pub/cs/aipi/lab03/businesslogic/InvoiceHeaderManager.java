package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.InvoiceHeader;

public class InvoiceHeaderManager extends PersistentEntityManager<InvoiceHeader> {
	
	public InvoiceHeaderManager() {
		super(InvoiceHeader.class);
	}

}
