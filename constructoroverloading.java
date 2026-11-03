class constructoroverloading {
    int id;
    String name;

    // Constructor 1: No parameters
    constructoroverloading() {
        id = 1;
        name = "Sheeba";
    }

    // Constructor 2: One parameter
    constructoroverloading(int a) {
        id = a;
        name = "Unknown";
    }

    // Constructor 3: Two parameters
    constructoroverloading(int a, String b) {
        id = a;
        name = b;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
    	constructoroverloading s1 = new constructoroverloading();
    	constructoroverloading s2 = new constructoroverloading(2);
    	constructoroverloading  s3 = new constructoroverloading(3, "Ravi");

        s1.display();
        s2.display();
        s3.display();
    }
}