class Details {

    private int id;
    private String name;
    private int marks;

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentTask {
    public static void main(String[] args) {

        Details s = new Details();

        s.setId(101);
        s.setName("Arun");
        s.setMarks(85);

        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(120);
    }
}