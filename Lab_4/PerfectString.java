import java.util.Scanner;

public class PerfectString{
    public static void main(String[] args){
        System.out.println("ENTER A STRING->");     
        Scanner sc= new Scanner(System.in);
        String str=sc.next();       //Entering a String From user

        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){    //storing occurance of each character in a list.
            arr[str.charAt(i)-97]++;
        }
        
        int flag=0;             //checking if each character appears only one or not.
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                flag=1;
                break;
            }
        }

        if(flag==0){
            System.out.println("Perfect String");
        }
        else{
            System.out.println("Not A Perfect String");
        }
    }
}