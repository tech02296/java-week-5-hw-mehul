package Programme;
/*
Write a Java program to retrieve an element (at a specified index)
 from a given array list
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String>vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GOURD");
        System.out.println(vegetableList);
        //Scanner using
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the index number: ");
        int index = scanner.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("Invalid Index!!");
        }
        scanner.close();
    }
    }


