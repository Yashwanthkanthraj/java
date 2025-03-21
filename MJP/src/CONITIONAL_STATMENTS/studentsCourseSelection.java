
package CONITIONAL_STATMENTS;


public class studentsCourseSelection {

    public static void main(String[] args) {

        String course = "Theatre";

        if (course.equals("biology")) {
            System.out.println("enroll in Biology course !");
            
        } else if (course.equals("physics")) {
            System.out.println("enroll in Physics course !");

        } else if (course.equals("Theatre")) {
            System.out.println("enroll in Theatre course !");

        } else {
            System.out.println("course not found !");
        }

    }

}