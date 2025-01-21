package homework;

import java.util.ArrayList;
import java.util.Random;

public class ex12 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number.add(random.nextInt(100) + 1);
        }
        System.out.println(number);
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        System.out.println("Sum: " + sum);
    }
}
