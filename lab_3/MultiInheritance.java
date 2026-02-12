public class MultiInheritance {
    public static void main(String[] args) {
        Z object = new Z(50, 25);

        System.out.println("Sum : " + object.CalcSum());
        System.out.println("Product : " + object.CalcProduct());
        System.out.println("Difference:= " + object.findDifference());

    }

}

class X {
    int i, j;

    X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    int CalcSum() {
        int s = i + j;
        return s;
    }
}

class Y extends X {
    Y(int i, int j) {
        super(i, j); // calls x
    }

    int CalcProduct() {
        int p = i * j;
        return p;
    }
}

class Z extends Y {
    Z(int i, int j) {
        super(i, j);// calls y
    }

    int findDifference() {
        return i - j;
    }
}
