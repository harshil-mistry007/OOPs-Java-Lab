package arithmetic;

import java.util.Scanner;

public class q1_ArithmeticApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1");
        int a = sc.nextInt();
        System.out.print("Enter number 2");
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;
        int difference = a - b;
        int quotient = a / b;
        // print
        System.out.println(sum);
        System.out.println(product);
        System.out.println(difference);
        System.out.println(quotient);
        sc.close();
    }
}
