import java.util.Scanner;

public class Exceed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String->");
        String str=sc.next();
        System.out.print("Enter the value of n->");
        int n=sc.nextInt();

        for(int i=0;i<str.length();i++){
            if(i>=n){
                System.out.print(str.charAt(i));
            }
        }
    }
}