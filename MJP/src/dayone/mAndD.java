package firstweek.dayone;

public class mAndD {
    public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
 double total = tax*subtotal + subtotal;
System.out.println(total);

double perPerson = total/4;
System.out.println(perPerson);
	}
}
