import java.util.*;

class Student {
    int id;
    String name;
    String department;
    int marks;

    Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> studentIds = new HashSet<>();

        addStudent(students, studentIds, new Student(101, "Arun", "CSE", 85));
        addStudent(students, studentIds, new Student(102, "Priya", "IT", 92));
        addStudent(students, studentIds, new Student(103, "Kavi", "ECE", 78));
        addStudent(students, studentIds, new Student(104, "Ravi", "CSE", 95));
        addStudent(students, studentIds, new Student(105, "Meena", "IT", 88));

        System.out.println("All Student Records:");

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            s.display();
        }

        int searchId = 102;

        System.out.println("\nSearching Student ID: " + searchId);

        if (studentIds.contains(searchId)) {
            for (Student s : students) {
                if (s.id == searchId) {
                    s.display();
                }
            }
        } else {
            System.out.println("Student Not Found");
        }

        int newId = 103;

        if (studentIds.contains(newId)) {
            System.out.println("\nDuplicate ID " + newId + " - Registration Not Allowed");
        }

        int removeId = 103;

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();

            if (s.id == removeId) {
                it.remove();
                studentIds.remove(removeId);
                System.out.println("\nStudent " + removeId + " Deleted Successfully");
                break;
            }
        }

        System.out.println("\nUpdated Student Records:");

        for (Student s : students) {
            s.display();
        }

        Student topper = Collections.max(students,
                Comparator.comparingInt(s -> s.marks));

        System.out.println("\nTopper Details:");
        topper.display();

    }

    static void addStudent(ArrayList<Student> students,
            HashSet<Integer> studentIds, Student s) {

        if (!studentIds.contains(s.id)) {
            students.add(s);
            studentIds.add(s.id);
        } else {
            System.out.println("Duplicate Student ID Not Allowed");
        }
    }
}
