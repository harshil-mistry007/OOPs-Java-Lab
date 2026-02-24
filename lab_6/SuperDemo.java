class A {
    int x = 100;

    A() {
        System.out.println("A Without parameter :");

    }

    A(int i) {
        // this.i = i;
        System.out.println("A int :" + i);
    }
}

class B extends A {
    int x = 200;

    B() {
        super();
        System.out.println("B Without parameter :");
    }

    B(int i, int y) {
        super(i);
        this.x = y;// x=20;
        System.out.println("B int " + y);

    }

    void show() {
        System.out.println("Superclass variable using super: " + super.x);
        System.out.println("Subclass variable using this: " + this.x);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B a = new B(10, 20);
        a.show();

    }

}
