package array;
import java.util.Arrays;
public class searchh{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int index=Arrays.binarySearch(arr,20);
        System.out.println("Index:"+index);
    }
}
