package org.example.review8;

import org.example.review8_1.Orthodontist;

public class Hospital {
    public static void main(String[] args) {

        Doctor.hospital = "UK";

        Surgeon surgeon = new Surgeon("John","Doe","Surgeon",20,"Lexington,KY");
        surgeon.checkVitals(); //parent class
        surgeon.checkVitals("Jane Smith"); //parentclass
        surgeon.prescribeMedication("Smith"); //child class
        Doctor.work(); //accessing static method in static way from the class where it was define
        Surgeon.work(); //accessing static method from parent class in static way using child className

        Orthodontist ortho = new Orthodontist("Josh","Smith","Orthodontist",15);
        Orthodontist.work(); //parent
        ortho.checkVitals(); //parent
        ortho.prescribeMedication("Pain Killers"); //child
        ortho.printSpeciality(); //child

        /*
        Polymorphism in JAVA:
          1. Compile Time/Static Binding? Early Binding
              achived through method overloading
          2. RunTime /Dynamic Binding/ Late Binding
           achived through method overriding
         */
        System.out.println("  _________________________________________________  ");

        Doctor ortho1 = new Orthodontist("Josh","Smith","Orthodontist",15);
        ortho1.checkVitals();
        ortho1.checkVitals("Micheal");
         // we are acheiving a runtime poly through method overriding
         // during runtime Java gives preference to the object type (in this case it Object of child class
        ortho1.prescribeMedication("Pills");  //JAVA executed child class method

        System.out.println("  ---------------------------------------------------  ");

        Doctor sur = new Surgeon("John","Doe","Surgeon",20,"Lexington,KY");
        sur.checkVitals();
        sur.checkVitals("Paul");
        sur.prescribeMedication("pills");

    }
}
