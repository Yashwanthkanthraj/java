package firstweek.CONITIONAL_STATMENTS;

public class onlineShopping {

    boolean isFilled;
    double billAmount;
    String shipping;

    public onlineShopping(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare conditional statement here
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            return 1.75;
        } else {
            return 0.50;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        onlineShopping book = new onlineShopping(true, 9.99, "Express");
        onlineShopping chemistrySet = new onlineShopping(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
