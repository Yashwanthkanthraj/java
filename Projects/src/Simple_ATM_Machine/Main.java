package Simple_ATM_Machine;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
      
        atm.addAccount(new Account("8792477158", 9223, 10000));
        atm.addAccount(new Account("8792477168", 9113, 25000));

        atm.startATM();

    }
}
