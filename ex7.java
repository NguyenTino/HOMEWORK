package homework;

import java.util.ArrayList;

public class ex7 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(14);
        number.add(9);
        number.add(2);
        number.add(0);
        number.add(6);
        System.out.println(number);
        ArrayList<Integer> reverse=new ArrayList<>();
        for (int i= number.size()-1;i>=0;i--){
            reverse.add(number.get(i));
        }
        System.out.println(reverse);
    }
}
