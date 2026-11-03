package array;

import java.util.Arrays;
public class task3{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};

        int[] copy = Arrays.copyOf(arr,2);

        System.out.println(Arrays.toString(copy));
    }
}
