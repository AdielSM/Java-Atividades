package DesafiosAula.LinkedListChallenge;

import java.util.*;

public class Main {
    private final static Scanner in = new Scanner(System.in);
    private static ListIterator<Town> townsIterator;
    private static int position = 0;
    private static String lastAction = "";


    public static void main(String[] args) {

        TownFactory.loadTownsFromFile();
        var towns = TownFactory.getTownsList();
        townsIterator = towns.listIterator();

        var validOpitions = new ArrayList<String>(List.of("F", "B", "L", "Q","M"));

        while (true){
            displayMenu();
            String input = getUserInput();

            if(validOpitions.contains(input)){
                iteratorAction(input);
            } else {
                System.out.println("Write a valid option.\n");
            }
        }
    }

    public static void iteratorAction(String type){
        switch (type){
            case "F":
                if(townsIterator.hasNext() && lastAction.equals("B")){
                    townsIterator.next();
                    System.out.println(townsIterator.next());
                    position++;
                } else if (townsIterator.hasNext()){
                    System.out.println(townsIterator.next());
                    position++;
                } else {
                    System.out.println("You're in the final! We will reset the infos");
                    position = 0;
                    resetIterator();
                    System.out.println(townsIterator.next());
                }
                lastAction = "F";
                break;
            case "B":
                lastAction = "B";
                if(townsIterator.hasPrevious()){
                    try {
                        townsIterator.previous();
                        System.out.println(townsIterator.previous());
                        position--;
                    } catch (NoSuchElementException e){
                        System.out.println("You're in the begin!");
                        System.out.println(townsIterator.next());
                        position = 0;
                    }
                } else{
                    System.out.println("You're in the begin!");
                    System.out.println(townsIterator.next());
                    position = 0;
                }
                break;
            case "L":
                lastAction = "L";
                resetIterator();
                while(townsIterator.hasNext()){
                    Town nextTown = townsIterator.next();
                    System.out.println(nextTown);
                }
                resetIterator(position);
                break;
            case "M":
                System.out.println("Returning to the menu...");
                break;
            default:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    public static void resetIterator(){
        while(townsIterator.hasPrevious()){
            townsIterator.previous();
        }
    }

    public static void resetIterator(int position){
        while(townsIterator.hasPrevious()){
            townsIterator.previous();
        }
        for (int i = 0; i < position + 1; i++) {
            townsIterator.next();
        }
    }

    public static void displayMenu(){
        System.out.println("""
                
                Available actions:
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

    public static String getUserInput(){
        System.out.print("Option> ");
        return in.nextLine().toUpperCase();
    }

}
