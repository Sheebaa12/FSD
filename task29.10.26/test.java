import java.util.*;

public class test {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Lily");
        list.add("Taylor");
        list.add("Hanah");
        list.add("Lily");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
