package FigPackage;

public class Cone extends Figure {
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
