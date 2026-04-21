package Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.age = 18;

        s1.printInfo(s1.age);
        Student s2 = new Student();
        s2.name = "Jora";
        s2.age = 19;
        s2.printInfo(s2.name, s2.age);

    }
}
