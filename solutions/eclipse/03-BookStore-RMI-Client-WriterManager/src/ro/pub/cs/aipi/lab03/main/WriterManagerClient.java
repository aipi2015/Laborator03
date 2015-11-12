package ro.pub.cs.aipi.lab03.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ro.pub.cs.aipi.lab03.businesslogic.WriterManagerInterface;
import ro.pub.cs.aipi.lab03.general.Constants;
import ro.pub.cs.aipi.lab03.general.Utilities;
import ro.pub.cs.aipi.lab03.result.WriterInformation;

public class WriterManagerClient {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You must specify the IP address on which the rmiregistry runs!");
			return;
		}

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {
			String serviceName = Constants.SERVICE_NAME;
			Registry registry = LocateRegistry.getRegistry(args[0]);
			WriterManagerInterface service = (WriterManagerInterface) registry.lookup(serviceName);
			int option = -1;
			do {
				Utilities.displayMenu();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				option = Integer.parseInt(bufferedReader.readLine());
				switch (option) {
				case Constants.OPTION_DELETE_WRITERS_WITHOUT_BOOKS:
					System.out.format("A number of %d writers without books have been deleted!%n",
							service.deleteWritersWithoutBooks());
					break;
				case Constants.OPTION_GET_WRITERS_BIBLIOGRAPHY:
					System.out.println("Enter number of books total: ");
					int numberOfBooksTotal = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter number of books alone: ");
					int numberOfBooksAlone = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter number of books collaboration: ");
					int numberOfBooksCollaboration = Integer.parseInt(bufferedReader.readLine());
					Utilities.displayResults(service.getWritersBibliography(numberOfBooksTotal, numberOfBooksAlone,
							numberOfBooksCollaboration), WriterInformation.class);
					break;
				case Constants.OPTION_QUIT:
					break;
				default:
					System.out.println("You have entered an invalid option");
					break;
				}
			} while (option != Constants.OPTION_QUIT);
		} catch (Exception exception) {
			System.out.println("An exception has occurred: " + exception.getMessage());
			if (Constants.DEBUG) {
				exception.printStackTrace();
			}
		}
	}

}
