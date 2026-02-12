// qn 4 
class Fruit {
    String Name;
    int size;
    float price;

    Fruit(String Name, int size, float price) {// constructor
        this.Name = Name;
        this.size = size;
        this.price = price;
    }

    void displayFruit() {// method
        System.out.println("Name: " + Name);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}

public class Display {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple", 5, 100.5f);
        Fruit f2 = new Fruit("Orange", 11, 97.5f);

        f1.displayFruit();
        System.out.println();
        f2.displayFruit();

    }

}