
abstract class Car {
    protected String company = "car Company";

    void Display() {
        System.out.println("Brand : " + company);
    }

    abstract void avg();

    abstract String mode();

}

class Maruti extends Car {
    void avg() {
        System.out.println("Average of Maruti is : " + "20 to 28 kmpl");
    }

    String mode() {
        return "Petrol";
    }

}

class santro extends Car {
    void avg() {
        System.out.println("Average of santro is : " + "30 kmpl");
    }

    String mode() {
        return "CNG";
    }
}

public class Car1 {
    public static void main(String[] args) {
        Car c;
        c = new Maruti();
        c.Display();
        c.avg();
        System.out.println("Mode: " + c.mode() + "\n");

        c = new santro();
        c.Display();
        c.avg();
        System.out.println("Mode: " + c.mode());
    }

}
