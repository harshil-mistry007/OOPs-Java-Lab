import java.util.Scanner;

public class mileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miles;
        int gallons;

        double totalMiles = 0;
        double totalGallons = 0;

        System.out.println("Enter  miles driven (-1 to exit)");
        miles = sc.nextInt();

        while (miles != -1) {

            System.out.println("gallon used in this trip ");
            gallons = sc.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.println("Miles per gallon for this trip: " + milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            double Mileage_per_gallons = totalMiles / totalGallons;

            System.out.println(" miles per gallon : " + Mileage_per_gallons);

            System.out.print("\nEnter miles driven (-1 to quit): ");
            miles = sc.nextInt();
        }

        System.out.println("\n Test over ");
    }
}
