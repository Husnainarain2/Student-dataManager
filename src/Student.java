public class Student {

    private String name;
    private int rollNumber;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println(
                "Name: " + name +
                        ", Roll Number: " + rollNumber +
                        ", Marks: " + marks
        );
    }
}
