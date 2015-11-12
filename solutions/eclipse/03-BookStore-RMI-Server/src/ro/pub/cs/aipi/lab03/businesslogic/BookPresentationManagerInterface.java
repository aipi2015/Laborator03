package ro.pub.cs.aipi.lab03.businesslogic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import ro.pub.cs.aipi.lab03.result.BookPresentationInformation;
import ro.pub.cs.aipi.lab03.result.SupplyOrderInformation;

public interface BookPresentationManagerInterface extends Remote {

	public List<BookPresentationInformation> updateBookPresentationPriceForBooksWithMultipleFormats(int numberOfFormats,
			double amount) throws RemoteException;

	public List<SupplyOrderInformation> makeSupplyOrderBasedOnStockpile(int stockpile) throws RemoteException;

}
