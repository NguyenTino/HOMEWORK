package homework;

import java.util.ArrayList;

public class ex9 {
    
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(14);
        number.add(9);
        number.add(2);
        number.add(0);
        number.add(0);
        number.add(6);
        System.out.println("list of numbers: " + number);
        int max = number.get(0);
        int min = number.get(0);
        for (int i = 1; i < number.size(); i++) {
            if (number.get(i) > max) {
                max = number.get(i);
            }
            if (number.get(i) < min) {
                min = number.get(i);
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
