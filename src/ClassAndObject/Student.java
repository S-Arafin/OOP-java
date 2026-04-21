package ClassAndObject;
public class Student {
    public String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    Student(){

    }
    public Student(String name, int age){
        System.out.println("Student Constructor");
        this.name = name;
        this.age = age;
    }
}
