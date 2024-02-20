package DesafiosAula.AutoboxingChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addCustomer("Tim");
        bank.addCustomer("Mike");
        bank.addCustomer("Percy");

        bank.transaction("Tim", 44.22);
        bank.transaction("Tim", 12.44);
        bank.transaction("Mike", -31.65);

        bank.listCustomers(true);
    }
}
