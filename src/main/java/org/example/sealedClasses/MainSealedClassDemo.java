package org.example.sealedClasses;


//Main Class
/*
 Sealed Classes : Are Use to avoid the inheritance, in java 17.
  Note : In This Example we are permits only two class to extend the Shape Class.
 */

public class MainSealedClassDemo {

    public static void main(String[] args) {
    Shape circle = new Circle("Circle",3.5);
    Shape rectangle = new Rectangle("Rectangle",15.0,4);

        System.out.println(circle
                .getClass()
                .getName() + " area: " +circle.area());

        System.out.println(rectangle.getClass().getName() + " area: " + rectangle.area());
    }

}
