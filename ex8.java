package homework;

import java.util.ArrayList;

public class ex8 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Strawberry");
        ArrayList<String> copy = new ArrayList<>(fruits);
        System.out.println("Original list: " + fruits);
        System.out.println("Copy list: " + copy);
    }
}
