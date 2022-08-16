package phone_book;


public class Node {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String mobile;
    //Parameterised constructor
    public Node(String firstName, String lastName, String address, String city, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.mobile = mobile;
     }
     @Override
     public String toString() {
        return "Full Name: '" + firstName + " " + lastName + '\'' +
                ", Address: '" + address + '\'' +
                ", City: '" + city + '\'' +
                ", Mobile: '" + mobile + '\'';     }
    //Getter for firstName
    public String getFirstName() {
        return firstName;
    }
    //Getter for lastName
    public String getLastName() {
        return lastName;
    }
    //Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Getter for address
    public String getAddress() {
        return address;
    }
    //Setter for address
    public void setAddress(String address) {
        this.address = address;
    }
    //Getter for city
    public String getCity() {
        return city;
    }
    //Setter for city
    public void setCity(String city) {
        this.city = city;
    }
    //Getter for mobile
    public String getMobile() {
        return mobile;
    }
    //Setter for mobile
    public void setMobile(String mobile) {
        this.mobile = mobile;
        }
    }
