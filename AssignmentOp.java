public class AssignmentOp {
    int balance = 5000;
    public static void main(String[] args) {
        AssignmentOp obj = new AssignmentOp();
        obj.displayBalance();
        obj.deposit();
        obj.withdraw();
    }
    void displayBalance() {
        System.out.println("Initial Balance: " + balance);
    }
    void deposit() {
        balance += 1500;
        System.out.println("After Deposit: " + balance);
    }
    void withdraw() {
        balance -= 1000;
        System.out.println("After Withdrawal: " + balance);
    }
}
