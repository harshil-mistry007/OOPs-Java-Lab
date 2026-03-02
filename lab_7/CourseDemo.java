class Course {
    int ID;
    String description;
    int duration;
    double fees;

    // Parameterized constructor
    Course(int ID, String description, int duration, double fees) {
        this.ID = ID;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }
    
    void GetData() {
        System.out.println("Course ID: " + ID);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fees: " + fees);
        System.out.println("----------------------");
    }
}

public class CourseDemo {
    public static void main(String[] args) {

        // Array of 5 Course objects
        Course[] c = new Course[5];

        // Initializing objects
        c[0] = new Course(101, "Java OOPS", 6, 15000);
        c[1] = new Course(102, "Maths", 4, 12000);
        c[2] = new Course(103, "DELD", 5, 18000);
        c[3] = new Course(104, "Data Science", 8, 25000);
        c[4] = new Course(105, "EEE", 3, 10000);

        // Display all courses
        for (int i = 0; i < 5; i++) {
            c[i].GetData();
        }
    }
}