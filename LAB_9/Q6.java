
import java.util.*;

class Fibonacci extends Thread {
    int n;

    Fibonacci(int n) {
        this.n = n;
        setPriority(8);
    }

    public void run() {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
        setPriority(5);
    }

    public void run() {
        int count = 0, num = 2;
        while (count < n) {
            boolean flag = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

public class Q6 {
    public static void main(String[] args) throws Exception {
        Fibonacci f = new Fibonacci(50);
        Prime p = new Prime(25);

        f.start();
        Thread.sleep(100);
        p.start();
    }
}