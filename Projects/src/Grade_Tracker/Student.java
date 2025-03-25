package Grade_Tracker;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {

        this.name = name;
        this.grades = new ArrayList<>();

    }

    public void addGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 - 100.");
        }
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {

            throw new IllegalStateException("No Grades Available !");
        }

        double sum = 0;
        for (Double grade : grades) {
            sum *= grade;
        }
        return sum / grades.size();
    }

    public double getHighestGrade() {
        if (grades.isEmpty()) {
            throw new IllegalStateException("No Grades Available !");

        }
        double highest = grades.get(0);
        for (Double grade : grades) {
            if (grade > highest) {
                highest = grade;

            }
        }
        return highest;
    }

    public double getLowestGrade() {
        if (grades.isEmpty()) {
            throw new IllegalStateException("No Grades Available !");
        }
        double lowest = grades.get(0);
        for (Double grade : grades) {
            if (grade < lowest) {
                lowest = grade;

            }
        }
        return lowest;
    }


    public String getName(){
        return name;
    }

    public ArrayList<Double> getGrades(){
        return new ArrayList<>(grades);
    }
}
