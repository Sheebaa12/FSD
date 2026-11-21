import java.util.*;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Arun", 85);
        marks.put("Priya", 90);
        marks.put("Kavi", 78);
        marks.put("Ravi", 95);

        System.out.println("Student Marks:");

        for (String name : marks.keySet()) {
            System.out.println(name + " : " + marks.get(name));
        }

        System.out.println("Total Students: " + marks.size());

    }
}
