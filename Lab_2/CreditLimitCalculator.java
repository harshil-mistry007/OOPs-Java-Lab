import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to exit): ");
        int accountNumber = sc.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter balance at the beginning of the month: ");
            int balance = sc.nextInt();

            System.out.print("Enter total charges this month: ");
            int charges = sc.nextInt();

            System.out.print("Enter total credits applied: ");
            int totalCredits = sc.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = sc.nextInt();

            int newBalance = balance + charges - totalCredits;

            System.out.println("-----------------------------------");
            System.out.printf("Account: %d%n", accountNumber);
            System.out.printf("New Balance: %d%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded!");
            }

            System.out.print("\nEnter next account number (or -1 to exit): ");
            accountNumber = sc.nextInt();
        }

        sc.close();
    }
}
