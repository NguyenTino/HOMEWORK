package homework;

import java.util.ArrayList;

public class ex10 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Tai");
        name.add("Quan");
        name.add("Tai");
        name.add("Khoa");
        name.add("Huy");
        name.add("Quan");
        System.out.println("Original list: " + name);
        for (int i = 0; i < name.size(); i++) {
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) {
                    name.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Non-duplicate lists: " + name);
    }
}
