import java.util.Scanner;

class Person {
    void Biggest(int num_1, int num_2, int num_3) {
        int a;
        if (num_1 > num_2)
            a = num_1;
        else
            a = num_2;
        if (num_3 > a)
            System.out.println("The biggest number is " + num_3);
        else
            System.out.println("The biggest number is " + a);
    }

    void Smallest(int num1, int num2, int num3) {
        int b;
        if (num1 > num2)
            b = num2;
        else
            b = num1;
        if (num3 > b)
            System.out.println("The smallest number is " + b);
        else
            System.out.println("The smallest number is " + num3);
    }
}

public class FindLargestAmong3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the Third number: ");
        int num3 = sc.nextInt();

        System.out.println("The sum of all the number is " + (num1 + num2 + num3));
        System.out.println("The product of all the number is " + (num1 * num2 * num3));
        System.out.println("The average of all the number is " + ((num1 + num2 + num3) / 3));

        Person u = new Person();
        u.Biggest(num1, num2, num3);
        u.Smallest(num1, num2, num3);

        sc.close();
    }

}
