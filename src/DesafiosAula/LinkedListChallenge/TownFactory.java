package DesafiosAula.LinkedListChallenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public final class TownFactory {
    private static final LinkedList<Town> towns = new LinkedList<>();

    private TownFactory() {
    }

    public static void loadTownsFromFile() {
        String fileName = "src/DesafiosAula/LinkedListChallenge/towns.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                String name = parts[0];
                int distance = Integer.parseInt(parts[1]);
                towns.add(new Town(name, distance));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayTowns() {
        for (Town town : towns) {
            System.out.println(town);
        }
    }

    public static LinkedList<Town> getTownsList(){
        return new LinkedList<>(towns);
    }

}
