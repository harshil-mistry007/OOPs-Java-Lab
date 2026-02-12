class Employee {

    private String firstName; // instance variable
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to calculate Yearly Salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {
        Employee ep1 = new Employee("Harshil", "Mistry", 40000);
        Employee ep2 = new Employee("Heet", "Desai", 35000);

        System.out.println("Yearly Salary of Employees:");

        System.out.println(ep1.getFirstName() + " " + ep1.getLastName() + "-> " + ep1.getYearlySalary());
        System.out.println(ep2.getFirstName() + " " + ep2.getLastName() + "-> " + ep2.getYearlySalary());

        // 10% hike
        ep1.setMonthlySalary(ep1.getMonthlySalary() * 1.10);
        ep2.setMonthlySalary(ep2.getMonthlySalary() * 1.10);

        System.out.println("\n Yearly Salary After 10% Hike :");

        System.out.println(ep1.getFirstName() + " " + ep1.getLastName() + "-> " + ep1.getYearlySalary());
        System.out.println(ep2.getFirstName() + " " + ep2.getLastName() + "-> " + ep2.getYearlySalary());

    }
}
