package homework;

import java.util.ArrayList;
import java.util.Random;

public class ex11 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number.add(random.nextInt(100) + 1);
        }
        System.out.println(number);
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

        // Hiển thị kết quả
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
