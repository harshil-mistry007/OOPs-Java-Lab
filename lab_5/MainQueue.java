import java.util.Scanner;

// Interface
interface QueueImpl {
    void insert(int x);

    void delete();

    void display();
}

// Class implementing interface
class QueueDemo implements QueueImpl {

    int queue[] = new int[10];
    int front = -1;
    int rear = -1;

    // Insert operation
    public void insert(int x) {
        try {
            if (rear == 9) {
                throw new Exception("Queue Overflow!");
            }

            if (front == -1)
                front = 0;

            rear++;
            queue[rear] = x;
            System.out.println("Inserted: " + x);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete operation
    public void delete() {
        try {
            if (front == -1 || front > rear) {
                throw new Exception("Queue Underflow!");
            }

            System.out.println("Deleted: " + queue[front]);
            front++;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Display operation
    public void display() {
        try {
            if (front == -1 || front > rear) {
                throw new Exception("Queue is Empty!");
            }

            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// Main class
public class MainQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueDemo q = new QueueDemo();

        int choice, value;

        do {
            System.out.println("\n1.Insert  2.Delete  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.insert(value);
                    break;

                case 2:
                    q.delete();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
