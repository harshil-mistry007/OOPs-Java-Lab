
import java.util.*;

class Convert extends Thread {
    String exp;

    Convert(String e) {
        exp = e;
    }

    public void run() {
        Stack<String> st = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                st.push(c + "");
            else {
                if (st.size() < 2)
                    return;
                String a = st.pop();
                String b = st.pop();
                st.push("(" + a + c + b + ")");
            }
        }
        if (!st.isEmpty())
            System.out.println(st.peek());
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext())
            return;
        String s = sc.next();
        new Convert(s).start();
    }
}
