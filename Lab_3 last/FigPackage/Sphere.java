package FigPackage;

public class Sphere extends Figure {

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
