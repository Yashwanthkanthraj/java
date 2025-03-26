package Grade_Tracker;

import java.util.ArrayList;
import java.util.Scanner;

//Create a class named Main.
public class Main {

    // Declare a static ArrayList<Student> called students to store all student
    // objects.
    private static ArrayList<Student> students = new ArrayList<>();

    // Declare a static Scanner object to read user input.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // Create the main Method

        students.add(new Student("yash"));
        students.add(new Student("myna"));
        students.add(new Student("ravi"));

        boolean isRunning = true;
        while (isRunning) {

            System.out.println("\n ---- Student grade Tracker ----");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade To Student");
            System.out.println("3. View Student Statistics ");
            System.out.println("4. List All Students");
            System.out.println("5. Exiting The Program");
            System.out.println(" Enter Your Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGradeToStudent();
                    break;
                case 3:
                    viewStudentStatistics();
                    break;
                case 4:
                    listAllStudents();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Inavalid choice. Try Again. ");
            }
        }
        scanner.close();
    }

    private static void addStudent() {

        System.out.print(" Enter a Student name: ");
        String name = scanner.nextLine();
        students.add(new Student(name));
        System.out.println("Student " + name + " added.");
    }

    private static void addGradeToStudent() {
        if (students.isEmpty()) {
            System.out.println("NO students available. Add a student first");
            return;
        }

        System.out.println(" Select a Student :");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + "." + students.get(i).getName());
        }

        System.out.println("Enter the Student number:");
        int studentIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (studentIndex < 0 || studentIndex >= students.size()) {
            System.out.println("Inavalid Student Number!");
            return;
        }
        System.out.println("Enter the Grade (0-100) :");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        try {
            students.get(studentIndex).addGrade(grade);
            System.out.println("grade added");
        } catch (IllegalArgumentException e) {
            System.out.println("Error :" + e.getMessage());
            // TODO: handle exception
        }
    }

    private static void viewStudentStatistics() {
        if (students.isEmpty()) {
            System.out.println("No Stedents Available, First add Students");
            return;
        }

        System.out.println("Select a Student: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + "." + students.get(i).getName());
        }

        System.out.println("Enter A Student Number: ");
        int studentIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (studentIndex < 0 || studentIndex >= students.size()) {
            System.out.println("Invalid student number.");
            return;
        }

        Student student = students.get(studentIndex);
        try {
            System.out.println("\n ---Students Statistics for: " + student.getName());
            System.out.println("Grades : " + student.getGrades());
            System.out.println("Average: %.2f\n" + student.calculateAverage());
            System.out.println("HighestGrade :" + student.getHighestGrade());
            System.out.println("lowestGrade: " + student.getLowestGrade());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n--- All Students ---");
        for (Student student : students) {
            System.out.println("- " + student.getName() + " (Grades: " + student.getGrades() + ")");
        }
    }
}
