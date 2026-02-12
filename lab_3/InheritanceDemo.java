
import java.util.Scanner;

class figure {
    double r, a, v;

    public void dispArea() {
        System.out.println("Area of Cone : " + a);
    }

    public void dispVolume() {
        System.out.println("Volume of Cone = " + v);
    }
}

class Cone extends figure {
    double h, s; // s is slant height

    public void calcArea(double r, double h) {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt(r * r + h * h);
        this.a = (Math.PI * r * r) + (Math.PI * r * s);
    }

    public void calcVolume(double r, double h) {
        this.v = (Math.PI * r * r * h) / 3;
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of cone ");
        double radius = sc.nextDouble();
        System.out.println("Enter Height of cone ");
        double height = sc.nextDouble();
        Cone c = new Cone(); // create object

        c.calcArea(radius, height); // call baby/child
        c.calcVolume(radius, height); // call baby/child

        c.dispArea();// inherti
        c.dispVolume();// inherit

    }

}
