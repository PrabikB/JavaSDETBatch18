package org.example.class17;

public class Parent {

    String name = "israel";

}
class Child extends Parent{
    String name = "maria";
    void print(){
        String name = "John";

       // System.out.println(name); // first priorty gives to local
        //System.out.println(this.name); // this keyword refers from instacce variable
        System.out.println(super.name); // super keyword refers from parent class
    }
}

class Tester{
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}