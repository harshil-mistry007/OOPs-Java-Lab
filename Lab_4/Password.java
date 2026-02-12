import java.util.*;

public class Password{
    public static void check(String password){
        int len=password.length();
        if(len>=5 && len<=12){
            int l=0,d=0,u=0,s=0;
            for(int i=0;i<len;i++){
                if (Character.isLowerCase(password.charAt(i))) {
                    l++;
                }
                if (Character.isDigit(password.charAt(i))) {
                    d++;
                }
                if (Character.isUpperCase(password.charAt(i))) {
                    u++;
                }
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    s++;
                }
            }

            if(l>=1 && d>=1 && u==0 && s==0){
                System.out.println("Correct password");
            }
            else{
                System.out.println("Wrong password");
            }
        }
        else{
            System.out.println("Wrong password");
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        check(str);

    }
}