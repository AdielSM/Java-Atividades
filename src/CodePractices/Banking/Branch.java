package CodePractices.Banking;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }

    public boolean newCustomer(String nameCostumer, double initialTransaction){
        Customer customer = findCustomer(nameCostumer);

        if(customer == null){
            this.customers.add(new Customer(nameCostumer, initialTransaction));
            return true;
        }

        return false;

    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);

        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name){
        for(var c : this.customers){
            if (c.getName().equals(name)){
                return c;
            }
        }

        return null;
    }
}
