package DesafiosAula.ArrayListChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println("== Welcome to your Grocery List ==");

        while (true) {
            menu();
            String option = getInput(in);

            switch (option){
                case "1":
                    System.out.println("""
                            Write the items who you want to add in list
                            (Separate the values by comma)
                            """);
                    String[] items = getInput(in).split(",");
                    ArrayList<String> validate = validateItemsAdd(items, groceryList);

                    if(validate.isEmpty()){
                        groceryList.addAll(List.of(items));
                        System.out.println("Elements added successfully!");
                    } else {
                        System.out.println("The following items are already in the list: ");
                        for (String s : validate) {
                            System.out.println(s);
                        }
                        System.out.println("Nothing was added");
                    }
                    break;
                case "2":
                    System.out.println("""
                            Write the items who you want to remove from list
                            (Separate the values by comma)
                            """);
                    String[] itemsToRemove = getInput(in).split(",");
                    ArrayList<String> validateRemove = validateItemsRemove(itemsToRemove, groceryList);

                    if(validateRemove.isEmpty()){
                        groceryList.removeAll(List.of(itemsToRemove));
                        System.out.println("Elements removed successfully!");
                    } else {
                        System.out.println("The following items are not in the list: ");
                        for (String s : validateRemove) {
                            System.out.println(s);
                        }
                        System.out.println("Nothing was removed");
                    }

                    break;
                case "3":
                    System.out.println("Write the item who you want to search in list");
                    String item = getInput(in);

                    if(groceryList.contains(item)){
                        System.out.println("The item is in the list");
                    } else {
                        System.out.println("The item is not in the list");
                    }

                    break;
                case "4":

                    if(groceryList.isEmpty()){
                        System.out.println("The list is empty");
                    } else {
                        System.out.println("Your list: ");
                        for (String s : groceryList) {
                            System.out.print(s + " ");
                        }
                    }

                    break;
                case "5":
                    System.out.println("Exiting...");
                    in.close();
                    return;
                default:
                    System.out.println("Enter a valid option. (1-5)");
            }

        }
    }

    public static void menu(){
        System.out.println("""
                
                1 - Add Items
                2 - Remove Items
                3 - Search Items in List
                4 - Show List
                5 - Exit
                """
        );
    }

    public static String getInput(Scanner scanner){
        System.out.print("Option> ");
        return scanner.nextLine().toUpperCase();
    }

    public static ArrayList<String> validateItemsAdd(String[] array, ArrayList<String> list){

        ArrayList<String> repeated = new ArrayList<>();

        for (String s : array) {
            if (list.contains(s)){
                repeated.add(s);
            }
        }

        return repeated;
    }

    public static ArrayList<String> validateItemsRemove(String[] array, ArrayList<String> list){

        ArrayList<String> notInList = new ArrayList<>();

        for (String s : array) {
            if (!list.contains(s)){
                notInList.add(s);
            }
        }

        return notInList;
    }

}
