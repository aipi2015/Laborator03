package ro.pub.cs.aipi.lab03.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ro.pub.cs.aipi.lab03.businesslogic.BookManagerInterface;
import ro.pub.cs.aipi.lab03.general.Constants;
import ro.pub.cs.aipi.lab03.general.Utilities;
import ro.pub.cs.aipi.lab03.result.BookInformation;
import ro.pub.cs.aipi.lab03.result.BookInformationDetailed;

public class BookManagerClient {

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
			BookManagerInterface service = (BookManagerInterface) registry.lookup(serviceName);
			int option = -1;
			do {
				Utilities.displayMenu();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				option = Integer.parseInt(bufferedReader.readLine());
				switch (option) {
				case Constants.OPTION_GET_BOOKS_LIST:
					Utilities.displayResults(service.getBooksList(), BookInformation.class);
					break;
				case Constants.OPTION_GET_BOOKS_LIST_WITH_STOCKPILE:
					System.out.println("Enter stockpile: ");
					int stockpile = Integer.parseInt(bufferedReader.readLine());
					Utilities.displayResults(service.getBooksListWithStockpile(stockpile),
							BookInformationDetailed.class);
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
