import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        // remove first 3 characters
        for (int i = 0; i < 10; i++) {
            if (names[i].length() > 3)
                names[i] = names[i].substring(3);
            else
                names[i] = "";
        }
        System.out.println("Before sorting");
        for (String name : names) {
            System.out.println(name);
        }

        Arrays.sort(names);

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}