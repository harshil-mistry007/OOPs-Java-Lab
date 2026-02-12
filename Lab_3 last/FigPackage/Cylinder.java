package FigPackage;

public class Cylinder extends Figure {

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
