//package lab_7;

import java.util.Scanner;

class CalcIntrest {
    double principal, simple_annual_intrest;
    int no_of_months;
    double interest;

    CalcIntrest(double principal, int no_of_months, double simple_annual_intrest) {
        this.principal = principal;
        this.no_of_months = no_of_months;
        this.simple_annual_intrest = simple_annual_intrest;
    }

    double calculateBalance() {
        double years = no_of_months / 12.0;
        interest = principal * (simple_annual_intrest / 100) * years;
        return principal + interest;    
    }

    double Calc_Total_Intrest() {
        return interest;

    }
}

public class TotalIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate ");
        double r = sc.nextDouble();
        System.out.println("Enter No of months ");
        int m = sc.nextInt();

        CalcIntrest p1 = new CalcIntrest(p, m, r);
        double x = p1.calculateBalance();
        System.out.println("DETAILS : ");
        System.out.println("Principal " + p1.principal);
        System.out.println("no of months " + p1.no_of_months);
        System.out.println("rate " + p1.simple_annual_intrest);
        System.out.println("Total Balance : " + x);
        System.out.println("Total Intrest : " + p1.Calc_Total_Intrest());
    }

}
