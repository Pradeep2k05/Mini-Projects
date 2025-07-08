package cadibal_program;

class Student {
    private String name; // Private variable (Data Hiding)

    // Setter method to update name
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter method to retrieve name
    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Pradeep");
        System.out.println("Student Name: " + s1.getName());
    }
}
