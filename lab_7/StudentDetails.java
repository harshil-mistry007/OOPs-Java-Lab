class Teacher {
    String name;
    int age;
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Teacher {
    int rollNo;
    String course;

    Student(String name, int age, String subject, int rollNo, String course) {
        super(name, age, subject); // CALLS TEACHER (super);
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent() {
        displayTeacher(); // reuse method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Student s = new Student("Harshil", 19, "OOP", 34, "B-Tech");

        System.out.println("Student Details:");
        s.displayStudent();
    }
}