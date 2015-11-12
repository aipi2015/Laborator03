package ro.pub.cs.aipi.lab03.businesslogic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import ro.pub.cs.aipi.lab03.result.WriterInformation;

public interface WriterManagerInterface extends Remote {

	public int deleteWritersWithoutBooks() throws RemoteException;

	public List<WriterInformation> getWritersBibliography(int numberOfBooksTotal, int numberOfBooksAlone,
			int numberOfBooksCollaboration) throws RemoteException;

}
