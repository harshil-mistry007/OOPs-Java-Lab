package FigPackage;

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
