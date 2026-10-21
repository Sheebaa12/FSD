
import java.util.Scanner;

public class arithmetic_operators {
    int num1, num2;

    public static void main(String[] args) {
        arithmetic_operators obj = new arithmetic_operators();

        obj.getInput();
        obj.sum();
        obj.difference();
        obj.product();
        obj.quotient();
        obj.remainder();
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    void sum() {
        System.out.println("Sum = " + (num1 + num2));
    }

    void difference() {
        System.out.println("Difference = " + (num1 - num2));
    }

    void product() {
        System.out.println("Product = " + (num1 * num2));
    }

    void quotient() {
        System.out.println("Quotient = " + (num1 / num2));
    }

    void remainder() {
        System.out.println("Remainder = " + (num1 % num2));
    }
}
