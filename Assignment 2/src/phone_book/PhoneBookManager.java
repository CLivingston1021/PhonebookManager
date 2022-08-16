package phone_book;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class PhoneBookManager {
    private LinkedList<Node> phoneBook;
    //Initialise Empty PhoneBook
    PhoneBookManager() {
        this.phoneBook = new LinkedList<>();
    }
    //Add a new entry in the phonebook
    public boolean addNewEntry(String firstName, String lastName, String address, String city, String mobile) {
        return this.phoneBook.add(new Node(firstName, lastName, address, city, mobile));
    }
    //Modify an entry with the firstName and change the value to val based on param
    public void modifyEntry(String firstName, String val, int param) {
        for(Node contact: this.phoneBook) {
            if(contact.getFirstName().equals(firstName)) {
                if(param == 1) contact.setFirstName(val);
                else if(param == 2) contact.setLastName(val);
                else if(param == 3) contact.setAddress(val);
                else if(param == 4) contact.setMobile(val);
                else if(param == 5) contact.setCity(val);
                else {
                    System.out.println("Entry Modification Unsuccessful, Since Wrong Param Value Given!");
                    return;
                }
                System.out.println("Entry Modified Successfully!");
                return;
            }
        }
        System.out.println("Entry Modification Unsuccessful, Since User with Given Name Couldn't Be Found!");
    }
    //Delete an entry in the phonebook given the firstName
    public void deleteEntry(String firstName) {
        for(Node contact: this.phoneBook) {
            if(contact.getFirstName().equals(firstName)){
                this.phoneBook.remove(contact);
                System.out.println("Entry Deleted Successfully!");
                return;
            }
        }
        System.out.println("Entry Deletion Unsuccessful, Since User with Given Name Couldn't Be Found!");
    }
    //Displays the phonebook
    public void displayPhoneBook() {
        for(Node contact: this.phoneBook) {
            System.out.println(contact.toString());
        }
        System.out.println();
        System.out.println();
    }
    //Sorts the phonebook entries based on lastName
    public void sortPhoneBookByLastName() {
        Collections.sort(this.phoneBook, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }
        );
    }
}
