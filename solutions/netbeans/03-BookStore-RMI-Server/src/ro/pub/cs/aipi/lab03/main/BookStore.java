package ro.pub.cs.aipi.lab03.main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import ro.pub.cs.aipi.lab03.businesslogic.BookManager;
import ro.pub.cs.aipi.lab03.businesslogic.BookManagerInterface;
import ro.pub.cs.aipi.lab03.businesslogic.BookPresentationManager;
import ro.pub.cs.aipi.lab03.businesslogic.BookPresentationManagerInterface;
import ro.pub.cs.aipi.lab03.businesslogic.WriterManager;
import ro.pub.cs.aipi.lab03.businesslogic.WriterManagerInterface;
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

			String bookPresentationManagerServiceName = Constants.BOOK_MANAGER_PRESENTATION_SERVICE_NAME;
			BookPresentationManagerInterface bookPresentationManagerService = new BookPresentationManager();
			BookPresentationManagerInterface bookPresentationManagerProxy = (BookPresentationManagerInterface) UnicastRemoteObject
					.exportObject(bookPresentationManagerService, 0);
			registry.rebind(bookPresentationManagerServiceName, bookPresentationManagerProxy);
			System.out.format("[%s] successfully bounded%n", Constants.BOOK_MANAGER_PRESENTATION_SERVICE_NAME);

			String writerManagerServiceName = Constants.WRITER_MANAGER_SERVICE_NAME;
			WriterManagerInterface writerManagerService = new WriterManager();
			WriterManagerInterface writerManagerProxy = (WriterManagerInterface) UnicastRemoteObject
					.exportObject(writerManagerService, 0);
			registry.rebind(writerManagerServiceName, writerManagerProxy);
			System.out.format("[%s] successfully bounded%n", Constants.WRITER_MANAGER_SERVICE_NAME);
		} catch (Exception exception) {
			System.out.println("An exception has occurred: " + exception.getMessage());
			if (Constants.DEBUG) {
				exception.printStackTrace();
			}
		}
	}

}