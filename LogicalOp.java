import java.util.Scanner;
public class LogicalOp {
    int age, mark;
    public static void main(String[] args) {
        LogicalOp obj = new LogicalOp();
        obj.Input();
        obj.CheckEligibility();
    }
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter mark: ");
        mark = sc.nextInt();
    }
    void CheckEligibility() {
        System.out.println("Eligible: " + (age >= 18 && mark >= 50));
    }
}
