package org.example.class16;
/*Write program for multilevel inheritance where class Z inherits
from class Y and Class Y inherits from Class X.
 */
public class X {
    void printX(){
        System.out.println("hahahaha");
    }

}
class Y extends X{
    void printB(){
        System.out.println("lalalalalala");
    }

}
class Z extends Y{
    void printC(){
        System.out.println("wawawawa");
    }

}