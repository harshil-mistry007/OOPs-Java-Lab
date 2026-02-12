import java.util.Scanner;

public class program5space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 digit number");
        int n = sc.nextInt();
        int a = n / 10000;
        int b = (n / 1000) % 10;
        int c = (n / 100) % 10;
        int d = (n / 10) % 10;
        int e = (n / 1) % 10;

        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
        sc.close();

    }

}
