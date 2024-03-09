package CodePractices.Banking;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branchs;

    public Bank(String name){
        this.name = name;
        this.branchs = new ArrayList<>();
    }

    public boolean addCustomer(String nameBranch, String nameCostumer, double initialTransaction){
        Branch branch = findBranch(nameBranch);
        if (branch != null){
            return branch.newCustomer(nameCostumer, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameBranch, String nameCostumer, double transaction){
        Branch branch = findBranch(nameBranch);
        if (branch != null){
            return branch.addCustomerTransaction(nameCostumer, transaction);
        }
        return false;
    }


    public boolean addBranch(String nameBranch){
        Branch branch = findBranch(nameBranch);
        if(branch == null){
            this.branchs.add(new Branch(nameBranch));
            return true;
        }
        return false;
    }


    private Branch findBranch(String name){
        for(var branch: this.branchs){
            if (branch.getName().equals(name)) {
                return branch;
            }
        }

        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println(String.format("Customer details for branch %s", branch.getName()));
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            int customerIndex = 1;
            for (Customer branchCustomer : branchCustomers) {
                System.out.println(String.format("Customer: %s[%d]", branchCustomer.getName(), customerIndex));
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    int transactionIndex = 1;
                    for (Double transaction : transactions) {
                        System.out.printf("[%d] Amount %.2f%n", transactionIndex, transaction);
                        transactionIndex++;
                    }
                }
                customerIndex++;
            }
            return true;
        }
        return false;
    }
}

