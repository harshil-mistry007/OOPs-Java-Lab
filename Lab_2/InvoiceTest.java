import java.util.Scanner;

public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        this.quantity = (quantity > 0) ? quantity : 0;

        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }

    public double getInvoiceAmount() {
        return (double) quantity * pricePerItem;
    }

    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                ", totalAmount=" + getInvoiceAmount() +
                '}';
    }
}
public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice1 = new Invoice("12345", "Hammer", 5, 19.99);

        System.out.println("--- Invoice 1 (Valid Inputs) ---");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());
        System.out.println(invoice1.toString()); 
        System.out.println();

        
        Invoice invoice2 = new Invoice("67890", "Nails (Box)", -10, -5.50);

        System.out.println("--- Invoice 2 (Invalid Inputs Handled) ---");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity : " + invoice2.getQuantity());
        System.out.println("Price per Item : $" + invoice2.getPricePerItem());
        System.out.println("Total Invoice Amount : $" + invoice2.getInvoiceAmount());
        System.out.println();

       
        System.out.println("--- Invoice 1 Update Test ---");
        System.out.println("Original Amount: $" + invoice1.getInvoiceAmount());
        
        
        invoice1.setQuantity(10);
        invoice1.setPricePerItem(25.00);
        
        System.out.println("Updated Quantity: " + invoice1.getQuantity());
        System.out.println("Updated Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("New Total Invoice Amount: $" + invoice1.getInvoiceAmount());

        invoice1.setQuantity(-2);
        System.out.println("Quantity after setting negative : " + invoice1.getQuantity());
    }
}


