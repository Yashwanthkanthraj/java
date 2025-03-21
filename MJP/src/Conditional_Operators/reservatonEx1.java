package Conditional_Operators;

public class reservatonEx1 {

    int guestCount;
    int restaurentCapacity;
    boolean isReservatonConfirmed;
    boolean isRestaurentOpen;

    public reservatonEx1(int count, int capacity, boolean open) {

        if (count < 1 || count > 8) {
            System.out.println("Invalid Resveration");
        }

        guestCount = count;
        restaurentCapacity = capacity;
        isRestaurentOpen = open;

    }

    public void confirmReservation() {
        if (restaurentCapacity >= guestCount && isRestaurentOpen) {
            System.out.println("Reservation Confirmed.");
            isReservatonConfirmed = true;
        } else {
            System.out.println("Reservation UnSucessFull.");
            isReservatonConfirmed = false;
        }
    }

    public void informUser() {
        if (!isReservatonConfirmed) {
            System.out.println("Unable to confirm the resveration, please contact the restaurent for further details");
        } else {
            System.out.println("please enjoy your meal..!");
        }
    }

    public static void main(String[] args) {
        reservatonEx1 groupOf3 = new reservatonEx1(3, 12, true);
        groupOf3.confirmReservation();
        groupOf3.informUser();

        reservatonEx1 groupOf4 = new reservatonEx1(4, 03, true);
        groupOf4.confirmReservation();
        groupOf4.informUser();

    }

}
