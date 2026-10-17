import java.util.Scanner;

public class positivenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not a positive number");
        }
    }
}
