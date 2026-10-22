
class Person {
    String name = "Sheeba";
    int age = 22;
}

class Employee extends Person {
    int id = 201;
    int salary = 50000;
}

class Manager extends Employee {
    String department = "IT";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.display();
    }
}
