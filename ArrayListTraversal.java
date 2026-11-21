import java.util.*;

public class ArrayListTraversal {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("ArrayList Elements:");
        System.out.println(list);

        System.out.println("\nReverse Order:");
        ListIterator<String> li = list.listIterator(list.size());

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        System.out.println("\nUsing For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing forEach:");
        list.forEach(a -> System.out.println(a));

    }
}
