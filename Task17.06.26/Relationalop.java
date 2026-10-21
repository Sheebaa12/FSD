import java.util.Scanner;
public class Relationalop {
    int a, b;
    public static void main(String[] args) {
        Relationalop obj = new Relationalop();
        obj.Input();
        obj.Greater();
        obj.Less();
        obj.Equal();
        obj.NotEqual();
        obj.GreaterEqual();
        obj.LessEqual();
    }
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
    void Greater() {
        System.out.println(a + " > " + b + ": " + (a > b));
    }
    void Less() {
        System.out.println(a + " < " + b + ": " + (a < b));
    }
    void Equal() {
        System.out.println(a + " == " + b + ": " + (a == b));
    }
    void NotEqual() {
        System.out.println(a + " != " + b + ": " + (a != b));
    }
    void GreaterEqual() {
        System.out.println(a + " >= " + b + ": " + (a >= b));
    }
    void LessEqual() {
        System.out.println(a + " <= " + b + ": " + (a <= b));
    }
}
