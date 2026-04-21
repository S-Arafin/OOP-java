package Inheritance;

class Shape {
    String color;
    public void area(){
        System.out.println("Area");
    }

}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}
class EquilatrialTriangle extends Triangle {
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}


