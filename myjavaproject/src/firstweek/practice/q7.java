package firstweek.practice;

public class q7 {

    public static void main(String[] args) {

        int a = 3, b = 4, c = 5;

        boolean isValid = (a + b > c) && (a + c > b) && (b + c > a);
        
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
