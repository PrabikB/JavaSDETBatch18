package org.example.class14;

public class Students {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students

     */
    String name;
    String id;
    static int noOfStudents;

    public static void main(String[] args) {
        Students s1= new Students();
        s1.name = "John";
        s1.id = "SID123";
        Students.noOfStudents++;

        Students s2 = new Students();
        s2.name = "Paul";
        s2.id = "SID456";
        Students.noOfStudents++;

        Students s3 = new Students();
        s3.name = "Jack";
        s3.id = "SID789";
        Students.noOfStudents++;

        System.out.println("Total number of students are "+noOfStudents);
    }
}

