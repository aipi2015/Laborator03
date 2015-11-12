package ro.pub.cs.aipi.lab03.businesslogic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import ro.pub.cs.aipi.lab03.result.BookInformation;
import ro.pub.cs.aipi.lab03.result.BookInformationDetailed;

public interface BookManagerInterface extends Remote {

	public List<BookInformation> getBooksList() throws RemoteException;

	public List<BookInformationDetailed> getBooksListWithStockpile(int stockpile) throws RemoteException;

}
