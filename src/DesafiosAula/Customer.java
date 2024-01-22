package DesafiosAula;

/*
1- Create a new class Costumer
2- Create fields for the class: name, creditLimit, emailAddress
3- Create constructors
    3.1- Empty constructor
    3.2- Constructor with 2 parameters (name, creditLimit)
    3.3- Constructor with 3 parameters (name, creditLimit, emailAddress)
4- Create getters for all fields
5- Test and confirm it works
 */

public class Customer {
    private String name;
    private Double creditLimit;
    private String emailAddress;

    public Customer(String name, Double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(String name, String emailAddress){
        this(name, 0.0, emailAddress);
    }

    public Customer(){
        this("Adiel",10000.00,"adiel@mail.com");
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
