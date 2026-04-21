package Inheritance;

import ClassAndObject.Student;

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        Student s1 = new Student("jonas", 14);
        s1.printInfo();
    }
}
