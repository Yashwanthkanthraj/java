package java_Arrays;

import java.util.Arrays;

public class studentsIdCard {

    String[] name;
    int[] classno = { 10, 11, 12 };
    char[] section = { 'A', 'B', 'C' };
    char[] sex = { 'M', 'F' };
    long[] contactNo;
    int[] year;

    public studentsIdCard() {
        name = new String[10];
        contactNo = new long[10];
        year = new int[10];

    }

    public void setId(int stuindex, String studentsName, long studentsPhone,int accademicYear) {

        name[stuindex] = studentsName;
        contactNo[stuindex] = studentsPhone;
        year[stuindex] = accademicYear;

    }

    public void setSex(){
        
    }
public static void main(String[] args) {
    studentsIdCard s1 = new studentsIdCard();
    s1.setId(0, "Atharva", 1555245124, 2015);
    s1.setId(1, "Myna", 1212121212, 2021);

    System.out.println(Arrays.toString(s1.name));
    System.out.println(Arrays.toString(s1.contactNo));
    System.out.println(Arrays.toString(s1.year));

    for (int i = 0; i < s1.name.length; i++) {
        System.out.println("name -"+s1.name[i] + " : " + s1.contactNo[i]+" : "+s1.year[i]+" : ");
    }

    
}
}
