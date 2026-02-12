import java.util.Scanner;

public class Pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF a->");
        int a=sc.nextInt();     //starting of  range.
        System.out.println("ENTER THE VALUE OF b->");
        int b=sc.nextInt() ;    //end of range
        System.out.println("ENTER THE VALUE OF n->");
        int n=sc.nextInt();     // value of n

        int count=0;

        String s2=String.valueOf(n);
        for(int i=a;i<=b;i++){
            String s1=String.valueOf(i);
            if(s1.contains(s2)){
                count++;
            }
        }

        System.out.println(count);
    }
}