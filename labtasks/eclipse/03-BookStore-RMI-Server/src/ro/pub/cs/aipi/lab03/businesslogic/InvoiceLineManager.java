package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.InvoiceLine;

public class InvoiceLineManager extends PersistentEntityManager<InvoiceLine> {
	
	public InvoiceLineManager() {
		super(InvoiceLine.class);
	}

}
