package ClassAndObject;

public class ClassAndObject{
    public static void main(String[] args) {
        Penn pen1 = new Penn();
        pen1.color = "red";
        pen1.type = "gel";

        pen1.write();


        Penn pen2 = new Penn();
        pen2.color = "blue";
        pen2.type = "gel";

        pen1.printColor();
        pen2.printColor();

        Student student1 = new Student();
        student1.name = "John";
        student1.age = 18;

        Student student2 = new Student("Ster", 24);

        Student student3 = new Student(student1);
        student1.printInfo();
        student2.printInfo();
    }
}
