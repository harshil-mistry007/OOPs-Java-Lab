import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence find the");
        String str = sc.nextLine();

        String target = "the";

        int first = str.indexOf(target);
        int last = str.lastIndexOf(target);

        if (first == -1 || last == -1 || first == last) {
            System.out.println("Not enough occurrences");
        } else {
            String result = str.substring(first + target.length(), last);
            System.out.println("Extracted String: " + result);
        }
    }
}