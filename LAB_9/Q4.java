
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int p1 = sc.nextInt();
        if (!sc.hasNextInt())
            return;
        int p2 = sc.nextInt();

        Random r = new Random();
        int n1 = r.nextInt(100) + 1;
        int n2 = r.nextInt(100) + 1;

        System.out.println("Player1: " + n1);
        System.out.println("Player2: " + n2);

        if (n1 > n2)
            System.out.println("Winner: Player1 Points: " + (n1 - n2));
        else if (n2 > n1)
            System.out.println("Winner: Player2 Points: " + (n2 - n1));
        else
            System.out.println("Draw");
    }
}