package ro.pub.cs.aipi.lab03.main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import ro.pub.cs.aipi.lab03.businesslogic.BookManager;
import ro.pub.cs.aipi.lab03.businesslogic.BookManagerInterface;
import ro.pub.cs.aipi.lab03.general.Constants;

public class BookStore {

	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {
			Registry registry = LocateRegistry.getRegistry();

			String bookManagerServiceName = Constants.BOOK_MANAGER_SERVICE_NAME;
			BookManagerInterface bookManagerService = new BookManager();
			BookManagerInterface bookManagerProxy = (BookManagerInterface) UnicastRemoteObject
					.exportObject(bookManagerService, 0);
			registry.rebind(bookManagerServiceName, bookManagerProxy);
			System.out.format("[%s] successfully bounded%n", Constants.BOOK_MANAGER_SERVICE_NAME);

			// TODO: exercise 5d

			// TODO: exercise 7d

		} catch (Exception exception) {
			System.out.println("An exception has occurred: " + exception.getMessage());
			if (Constants.DEBUG) {
				exception.printStackTrace();
			}
		}
	}

}