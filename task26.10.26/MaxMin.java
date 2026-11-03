package array;

import java.util.Arrays;
public class MaxMin{
    public static void main(String[] args) {
        int[] arr = {5,26,95,32,14};
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }
}
