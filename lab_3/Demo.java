public class Demo {
    public static void main(String[] args) {
        // cone
        Figure f1 = new Cone(7, 9);
        f1.calcArea();
        f1.calcVol();
        f1.DispArea();
        f1.Dispvol();
        // cylinder
        Figure f2 = new Cylinder(5, 10);
        f2.calcArea();
        f2.calcVol();
        f2.DispArea();
        f2.Dispvol();
        // sphere
        Figure f3 = new Sphere(5);
        f3.calcArea();
        f3.calcVol();
        f3.DispArea();
        f3.Dispvol();

    }

}

abstract class Figure {

    double pi = 3.1420;
    double a, v;

    public abstract void calcArea();

    public abstract void calcVol();

    public abstract void DispArea();

    public abstract void Dispvol();
}

class Cone extends Figure {
    double r, h, s;

    // Constructor
    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    // method
    public void calcArea() {
        s = Math.sqrt(r * r + h * h); // slant height
        a = pi * r * (r + s); // area of cone
    }

    public void calcVol() {
        v = (pi * r * r * h) / 3;
    }

    public void DispArea() {
        System.out.println("Area of Cone = " + a);
    }

    public void Dispvol() {
        System.out.println("Volume of Cone = " + v);
    }
}

class Cylinder extends Figure {

    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = 2 * pi * r * (r + h);
    }

    public void calcVol() {
        v = pi * r * r * h;
    }

    public void DispArea() {
        System.out.println("Area of Cylinder = " + a);
    }

    public void Dispvol() {
        System.out.println("Volume of Cylinder = " + v);
    }
}

class Sphere extends Figure {

    double r;

    // Constructor
    Sphere(double r) {
        this.r = r;
    }

    // methods
    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVol() {
        v = (4.0 / 3.0) * pi * r * r * r;
    }

    public void DispArea() {
        System.out.println("Area of Sphere = " + a);
    }

    public void Dispvol() {
        System.out.println("Volume of Sphere = " + v);
    }
}
