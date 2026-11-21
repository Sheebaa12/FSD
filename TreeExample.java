import java.util.*;

public class TreeExample {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("TreeSet elements:");

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
