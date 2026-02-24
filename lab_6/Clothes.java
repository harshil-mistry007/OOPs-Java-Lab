class WashingMachine {
    int n;

    void switchOn() {
        System.out.println("Switch on");

    }

    void acceptDetergent() {
        System.out.println("Detergent added ");
        SwitchOff();
    }

    void SwitchOff() {
        System.out.println("Switch off");
    }

    int acceptClothes(int n) {
        System.out.println("No . of clothes Accepted " + n);
        acceptDetergent();
        return n;
    }

}

public class Clothes {
    public static void main(String[] args) {
        WashingMachine p1 = new WashingMachine();

        p1.switchOn();
        int c = p1.acceptClothes(10);
        System.out.println("total Clothes" + c);
    }
}
