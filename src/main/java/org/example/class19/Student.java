package org.example.class19;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {

    public void study(){
        System.out.println("Student is learning");
    }
    public void exam(){
        System.out.println("Student is attending exam");
    }
    public void askQuestion(){
        System.out.println("Student is asking question");
    }
}
class StntaxStudent extends Student{
    public void study(){
        System.out.println("Syntax student is learning Java");
    }
    public void exam(){
        System.out.println("Syntax student is attending exam");
    }
    public void askQuestion(){
        System.out.println("Syntax student is asking question about Pom.exl file");
    }
}
class CollegeStudent extends Student{
    public void study(){
        System.out.println("College student is learning");
    }
    public void exam(){
        System.out.println("College student is attending exam");
    }
    public void askQuestion(){
        System.out.println("College student is asking question");
    }
}
class SchoolStudent extends Student{
    public void study(){
        System.out.println("School student is learning");
    }
    public void exam(){
        System.out.println("School student is attending exam");
    }
    public void askQuestion(){
        System.out.println("School student is asking question");
    }
}
