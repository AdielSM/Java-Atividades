package CodePractices.Phone;

public class Main {
    public static void main(String[] args) {
        MobillePhone myPhone = new MobillePhone("12345");
        myPhone.addNewContact(Contact.createContact("Tim", "12345"));
        myPhone.addNewContact(Contact.createContact("Bob", "98765"));
        myPhone.addNewContact(Contact.createContact("Percy", "45678"));

        myPhone.printContacts();
        Contact update = myPhone.queryContact("Tim");
        myPhone.updateContact(update, Contact.createContact("Tom", "12345"));
        myPhone.printContacts();

        Contact remove = myPhone.queryContact("Bob");
        myPhone.removeContact(remove);
        myPhone.printContacts();
    }
}
