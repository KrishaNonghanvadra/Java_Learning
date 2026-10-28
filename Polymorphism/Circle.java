package Polymorphism;

public class Circle extends Shape{

    @Override // this is called annotation
    void area(){
        //this will run when obj of Circle is created
        // hence it is overriding the parent method
        System.out.println("Area is : 3.14 * r * r");
    }
}
