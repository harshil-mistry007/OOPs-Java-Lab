class Book {
    String author, title;
    int ID;
    double price;

    Book(int ID, String title, String author, double price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Book ID: " + ID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

class Periodical extends Book {
    String Period;

    Periodical(int ID, String title, String author, double price, String Period) {
        super(ID, title, author, price);
        this.Period = Period;
    }

    void updateDetails(double newPrice, String newPeriod) {
        price = newPrice;
        Period = newPeriod;
    }

    void displayPeriodical() {
        displayBook();
        System.out.println("Period: " + Period);
    }

}

public class BookDetails {
    public static void main(String[] args) {
        Periodical p = new Periodical(34, "How To Scam", "Harshil Mistry", 350, "Monthly");

        System.out.println("Original Details:");
        p.displayPeriodical();

        // updated period and price
        p.updateDetails(500, "Weekly");

        System.out.println("\nUpdated Details:");
        p.displayPeriodical();
    }

}
