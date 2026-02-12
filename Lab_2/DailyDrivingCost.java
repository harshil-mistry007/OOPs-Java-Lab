import java.util.Scanner;

public class DailyDrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total miles driven per day");
        int miles = sc.nextInt();
        System.out.println("cost per gallon of gasoline");
        float cost_gallon = sc.nextFloat();
        System.out.println("average fees per day");
        float avg_fees = sc.nextFloat();
        System.out.println("tolls per day");
        int tolls = sc.nextInt();
        int MPG = 25; // most of the cars miles per gallons
        float daily_driving_cost = (miles / MPG) * cost_gallon + avg_fees + tolls;
        System.out.println("daily driving cost = " + daily_driving_cost);
    }
}
