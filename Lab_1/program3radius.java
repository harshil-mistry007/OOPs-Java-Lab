import java.util.Scanner;

public class program3radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle");
        int r = sc.nextInt();
        double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("Diameter of circle is : " + diameter);
        System.out.println("Circumference of circle : " + circumference);
        System.out.println("Area of circle : " + area);
    }

}
