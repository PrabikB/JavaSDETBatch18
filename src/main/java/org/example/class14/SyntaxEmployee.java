package org.example.class14;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */
    static String ceo = "Sumair";
    String empID;
    int salary;

    void eID(){
        System.out.println("$"+salary+" "+empID);
    }

    public static void main(String[] args) {
        SyntaxEmployee synEmp = new SyntaxEmployee();
        synEmp.empID = "SE123000";
        synEmp.salary = 200000;
        synEmp.eID();
        System.out.println(SyntaxEmployee.ceo);

        SyntaxEmployee synEmp2 = new SyntaxEmployee();
        System.out.println("-------***********-------");

        synEmp2.empID = "SE456000";
        synEmp2.salary = 250000;
        synEmp2.eID();
        System.out.println(SyntaxEmployee.ceo);
    }

}
