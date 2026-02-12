import java.util.Scanner;

public class ParkingCharge {

    public static double find_charge(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }

        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.print("How many customers today: ");
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            System.out.print("Enter hours parked for customer " + (i + 1) + ": ");
            double hours = sc.nextDouble();

            double charge = find_charge(hours);
            totalReceipts += charge;

            System.out.printf("Charge for customer %d: $%f\n", i + 1, charge);
        }

        System.out.printf("Total receipts for yesterday: $%f\n", totalReceipts);

        sc.close();
    }
}
