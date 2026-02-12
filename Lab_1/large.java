
import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : a");
        int a = sc.nextInt();
        System.out.println("Enter the number : b");
        int b = sc.nextInt();
        if (a == b)
            System.out.println("both are equal = " + a);
        else if (a > b)
            System.out.println("a is larger , a=" + a);
        else
            System.out.println("b is larger,b=" + b);
        sc.close();

    }

}
