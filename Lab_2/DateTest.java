class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // setter

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // getter
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class DateTest {

    public static void main(String[] args) {

        // object
        Date date = new Date(1, 20, 2026);

        System.out.print("Initial Date: ");
        date.displayDate();

        date.setMonth(8);
        date.setDay(11);
        date.setYear(2007);

        // Display updated date
        System.out.print("Updated Date: ");
        date.displayDate();
    }
}
