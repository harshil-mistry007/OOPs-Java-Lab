import java.util.Scanner;

class CalcProfit {

    static double calculate(int i) {
        double ticketPrice = 5 * i;
        double theaterCost = 20;
        double attendeeCost = 0.5 * i;

        double totalProfit = ticketPrice - (theaterCost + attendeeCost);

        return totalProfit;
    }

    double Calcincome(int i) {
        double income = 5 * i;
        return income;

    }
}

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Attendees");
        int i = sc.nextInt();
        CalcProfit a = new CalcProfit();
        double profit = CalcProfit.calculate(i);
        System.out.println("Total price USD: " + profit);

        double incomee = a.Calcincome(i);
        System.out.println("Total Income : " + incomee);
        sc.close();

    }

}
