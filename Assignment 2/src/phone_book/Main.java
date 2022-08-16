package phone_book;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void printMainMenu() {
        System.out.println("Main Menu:- ");
        System.out.println("1: Add a New Entry");
        System.out.println("2: Modify an Entry");
        System.out.println("3: Delete an Entry");
        System.out.println("4: Sort PhoneBook");
        System.out.println("5: Display PhoneBook Entries");
        System.out.println("6: Exit");
        System.out.println("Enter your choice (1-6): ");
    }
    public static PhoneBookManager showAddMenu(PhoneBookManager manager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter New Entry Details- ");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String address = sc.nextLine();
        String city = sc.nextLine();
        String mobile = sc.nextLine();
        manager.addNewEntry(firstName, lastName, address, city, mobile);
        return manager;
    }
    public static PhoneBookManager showDeleteMenu(PhoneBookManager manager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Name to Delete Entry - ");
        String firstName = sc.nextLine();
        manager.deleteEntry(firstName);
        return manager;
    }
    public static PhoneBookManager showModifyMenu(PhoneBookManager manager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Name to Modify Entry - ");
        String firstName = sc.nextLine();
        System.out.println("Please Enter Which Field to Modify - ");
        System.out.println("1: First Name");
        System.out.println("2: Last Name");
        System.out.println("3: Address");
        System.out.println("4: City");
        System.out.println("5: Mobile");
        System.out.println("Enter your choice (1-5): ");

        int param = sc.nextInt();

        sc.nextLine();

        System.out.println("Please Enter The Modified Value - ");
        String val = sc.nextLine();
        manager.modifyEntry(firstName, val, param);
        return manager;
    }
    public static PhoneBookManager sortPhoneBook(PhoneBookManager manager) {
        System.out.println("Sorting PhoneBook by LastName");
        manager.sortPhoneBookByLastName();
        return manager;
    }
    //Test Class
    public static void main(String[] args) {
        //Initialise Empty PhoneBook
        PhoneBookManager manager = new PhoneBookManager();
        Scanner sc = new Scanner(System.in);
        while(true) {
            printMainMenu();
            int choice = sc.nextInt();
            if(choice > 6 || choice <= 0) {
                System.out.println("\n==>> Sorry Incorrect Input!! Please Enter A Choice Between 1-6!!" +
                        " Redirecting to Main Menu.\n");
                continue;
            }
            if(choice == 1) manager = showAddMenu(manager);
            else if(choice == 2) manager = showModifyMenu(manager);
            else if(choice == 3) manager = showDeleteMenu(manager);
            else if(choice == 4) manager = sortPhoneBook(manager);
            else if(choice == 5) manager.displayPhoneBook();
            else break;
        }
        System.out.println("\n\n-----------------------");
        System.out.println("Exiting The Application!!");
        System.out.println("-----------------------");
    }
}


