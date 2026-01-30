import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Class Strength: ");
        int studentStrength = input.nextInt();
        input.nextLine();

        ArrayList<Student> classData = new ArrayList<>();

        for (int i = 0; i < studentStrength; i++) {

            Student student = new Student();

            System.out.println("\nEnter data of Student " + (i + 1));

            System.out.print("Enter Student Name: ");
            student.setName(input.nextLine());

            System.out.print("Enter Roll Number: ");
            student.setRollNumber(input.nextInt());

            System.out.print("Enter Marks: ");
            student.setMarks(input.nextInt());
            input.nextLine(); // clear buffer

            classData.add(student);
        }

        System.out.println("\n📚 Class Data:");
        for (Student s : classData) {
            s.display();
        }

        input.close();
    }
}
