import java.util.Scanner;
/**
 * 
 */

/**
 * @author Lilkunt Sarvesha
 *
 */
public class LabInventory {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		LabInventory menu = new LabInventory();
		menu.printHeader();
		menu.printMenu();
		menu.runMenu();
	}
	
	private void printHeader() {
		System.out.println("**************************************************");
		System.out.println("       Welcome to our Menu selection!             ");
		System.out.println("**************************************************");
	}
	
	private void printMenu() {
		System.out.println("What do you want to do?");
		System.out.println("1) Enter a new item.");
		System.out.println("2) Change information of an existing item.");
		System.out.println("3) Display all the items.");
		System.out.println("4) Display items to be re-ordered.");
		System.out.println("5) Number of items currently in store.");
		System.out.println("0) Exit menu.");
	}

	public void runMenu() {
		System.out.println("Please enter your choice: ");
		int choice = -1;
		if (choice == 1);
			System.out.println("Please enter password: ");
		
	}
}
