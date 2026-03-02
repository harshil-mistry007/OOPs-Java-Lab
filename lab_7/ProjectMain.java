abstract class ProjectBase {

    // Common debugging method
    void debug() {
        System.out.println("Debugging start");
    }

    // Common method that all subclasses must implement
    abstract void execute();
}

// Class 1
class A extends ProjectBase {

    void execute() {
        System.out.println("Executing  A");
    }
}

// Class 2
class B extends ProjectBase {

    void execute() {
        System.out.println("Executing  B");
    }
}
public class ProjectMain {
    public static void main(String[] args) {

        ProjectBase obj1 = new A();
        ProjectBase obj2 = new B();

        obj1.debug();
        obj1.execute();

        System.out.println();

        obj2.debug();
        obj2.execute();
    }
}