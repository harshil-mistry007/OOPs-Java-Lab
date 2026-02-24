import java.util.Scanner;

class Point {
    int x, y, z;

    Point() {
        x = y = z = 0;
    }

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x y z:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sc.close();
    }

    void Display() {
        System.out.println("Point Co-ordinates are :" + "(" + x + "," + y + "," + z + ")");
    }

    double CalcDis() {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return distance;

    }

}

public class Distance {
    public static void main(String[] args) {
        Point origin = new Point();

        Point in = new Point();
        in.input();
        origin.Display();
        in.Display();
        double a = in.CalcDis();
        System.out.println("Distance between origin arbitrary point : " + a);
    }

}
