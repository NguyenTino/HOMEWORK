package homework;

import java.util.ArrayList;
import java.util.Random;

public class ex6 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            number.add(random.nextInt(50) + 1);
        }
        int count = 0;
        int count1 = 0;
        for (int n : number) {
            if (n % 2 == 0) {
                count++;
            } else {
                count1++;
            }
        }
        System.out.println("Number of odd numbers: " + count);
        System.out.println("Number of even numbers" + count1);
    }
}