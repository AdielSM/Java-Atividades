package DesafiosAula.AutoboxingChallenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean transaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.getTransactions().add(amount);
            return true;
        }
        return false;
    }

    public void listCustomers(boolean showTransactions) {
        for (Customer customer : this.customers) {
            System.out.println("Customer: " + customer.getName());
            if (showTransactions) {
                if (customer.getTransactions().isEmpty()) {
                    System.out.println("No transactions available");
                    return;
                } else {
                    System.out.println("Transactions: ");
                    for (int i = 0; i < customer.getTransactions().size(); i++) {
                        System.out.println("[" + (i + 1) + "] Amount " + customer.getTransactions().get(i));
                    }
                }
            }
        }
    }

    public void addCustomer(String customerName){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName));
        }
    }
    private Customer findCustomer(String customerName){
        for (Customer checkedCustomer : this.customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
