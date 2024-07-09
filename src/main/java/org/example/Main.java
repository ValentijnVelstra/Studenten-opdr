package org.example;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("valentijn", 28);
        dictionary.put("tom", 44);
        dictionary.put("karel", 101);

        while (true){
            Scanner optie = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Choose: 1. Add a person 2. Remove a person 3. Show list");
            Integer choice = optie.nextInt();  // input lezen welke keuze in het menu word gemaakt.

            switch(choice){ //de switch kijkt welke menu keuze is gamaakt
                case 1:  // case kijkt naar de waarde 1
                    Scanner name = new Scanner(System.in);  // scanner slaat nieuwe naam input op in variabele
                    System.out.println("Name: ");
                    String Add_name = optie.next();

                    Scanner age = new Scanner(System.in);  // scanner slaat nieuwe leeftijd input op in variabele
                    System.out.println("Age: ");
                    Integer Add_age = optie.nextInt();

                    dictionary.put(Add_name, Add_age); // dit voegt de 2 variabele toe aan de hashmap (genaamt dictionary)
                    break; // voorkomt dat de andere cases af gaan.
                case 2:
                    Scanner remover = new Scanner(System.in);  // scanner kijkt naar de naam om het te verweideren
                    System.out.println("Name: ");
                    String Remove_name = optie.next();

                    dictionary.remove(Remove_name); // haalt via de key een naam en leeftijd weg.
                    break;
                case 3:
                    for (Map.Entry<String, Integer> entry : dictionary.entrySet()) { // selecteerd de nodige hashmap
                        String key = entry.getKey();
                        int value = entry.getValue();
                        System.out.println("Name: " + key + ", Age: " + value); // print alle waardes uit
                    }
                    break;
            }
        }
    }
}