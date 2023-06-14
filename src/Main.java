interface Shape{  //An interface
     void area(int l); //This method must be declared in the child class
}
class Circle implements Shape{  //the class inherits the interface using implements keyword

    public void area(int r){
        System.out.println("Area of circle is:"+(3.14*Math.pow(r,2)));
    }
}
class Square implements Shape{
    public void area(int a){
        System.out.println("Area of the square is:"+(a*a));
    }
}
public class Main { //here public is the access specifier for the class
    public static void main(String args[]){
        Shape circle1=new Circle(); //This makes circle1 a reference to the Shape class and implments the method in Circle class
        circle1.area(15);
        Shape square1=new Square();
        square1.area(4);
    }
}
