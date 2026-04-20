
import java.util.*;

class Account {
    int balance = 600;

    synchronized void deposit(int amt) {
        balance += amt;
        System.out.println("Deposit: " + amt + " Balance: " + balance);
        notify();
    }

    synchronized void withdraw(int amt) {
        while (balance < amt) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        balance -= amt;
        System.out.println("Withdraw: " + amt + " Balance: " + balance);
    }
}

class Father extends Thread {
    Account acc;

    Father(Account a) {
        acc = a;
    }

    public void run() {
        Random r = new Random();
        while (true) {
            if (acc.balance > 2000)
                break;
            int amt = r.nextInt(200) + 1;
            acc.deposit(amt);
            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class Son extends Thread {
    Account acc;

    Son(Account a) {
        acc = a;
    }

    public void run() {
        Random r = new Random();
        while (true) {
            if (acc.balance < 500)
                break;
            if (acc.balance > 2000) {
                int amt = r.nextInt(150) + 1;
                acc.withdraw(amt);
            }
            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Account acc = new Account();
        Father f = new Father(acc);
        Son s = new Son(acc);
        f.start();
        s.start();
    }
}
