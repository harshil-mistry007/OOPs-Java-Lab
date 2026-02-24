import java.util.Scanner;

class Bank {
    double deposit(double amount, double balance) {
        double newbalance = amount + balance;
        return newbalance;
    }

    double withdraw(double amount, double balance) {

        if (balance >= amount) {
            double newbalance = balance - amount;
            return newbalance;
        } else
            return 0;
    }
}

public class AccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank p = new Bank();

        System.out.println("deposit (0) or withdraw(1) ");
        int n = sc.nextInt();
        System.out.println("Enter Balance");
        double b = sc.nextDouble();
        System.out.println("Enter Amount");
        double a = sc.nextDouble();
        if (n == 0) {
            double x = p.deposit(a, b);
            System.out.println("New balance after deposit : " + x);
        } else {
            double x = p.withdraw(a, b);
            System.out.println("New balance after Withdraw : " + x);
        }
        sc.close();

    }

}
