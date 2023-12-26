package org.example.replTask;

public class Repl146 {
    /* 1. Complete the Employee.java class:
Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)
Write two constructors:
* non-argument constructor
* parameterized constructor that will initialize all instance variables
Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
Output:
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
     */

    private String name;
    private String lastName;
    private int employeeID;
    private String startDate;
    private int salary;

    public Repl146(){
        System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
    }
    public Repl146(String name, String lastName, int employeeID, String startDate,int salary){
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
    }

    public static void main(String[] args) {
        Repl146 emp1 = new Repl146();
        Repl146 emp2 = new Repl146("Joe","Smith",12345,"01/01/1970",35000);
        emp2.printInfo();

    }
}
