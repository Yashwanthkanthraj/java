package firstweek.project;

public class droid {

    String name;
    int battery_level = 100;

    public droid(String driodname) {
        name = driodname;

    }

    public String toString() {
        // TODO Auto-generated method stub
        return "hello i'm the driod " + name;

    }

    public void performingTask(String task) {

        System.out.println(name + " is performing a " + task);
        battery_level = battery_level - 10;
    }

    public void statingItsBatteryLevel() {

        System.out.println("baterry level after the task is - " + battery_level + "%");

    }

    public int energyReport() {
        System.out.println("The present battery level is - " + battery_level + "%");
        return battery_level;
    }

    public int energyTransfer(droid d1batt, int d2Batt) {
        int temp1 = d1batt.battery_level; // 80%
        d1batt.battery_level = d2Batt;

        return temp1;

    }

    public static void main(String[] args) {

        droid d1 = new droid("codey");
        System.out.println(d1);
        d1.energyReport();
        System.out.println("-------------------");

        d1.performingTask("dancing");
        d1.energyReport();
        System.out.println("-------------------");

        d1.performingTask("cooking");
        d1.energyReport();
        System.out.println("-------------------");

        droid d2 = new droid(" drone ");
        d2.battery_level = d1.energyTransfer(d1, d2.battery_level);
        System.out.println(d2);
        d2.energyReport();
        System.out.println("-------------------");

        d2.performingTask("Hoovering");
        d2.energyReport();
        System.out.println("-------------------");

        d2.performingTask("Altitude flying");
        d2.energyReport();
    }
}
