package Oops;

class Person {
    String color = "Green";
}

class Student extends Person {
    String color = "Red";

    void displayColor() {
        System.out.println("Child color: " + color);
        System.out.println("Parent color: " + super.color);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.displayColor();
    }
}
