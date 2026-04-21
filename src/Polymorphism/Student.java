package Polymorphism;

class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String Name, int age){
        System.out.println("Name : " + Name + ", age : " + age);
    }
}
