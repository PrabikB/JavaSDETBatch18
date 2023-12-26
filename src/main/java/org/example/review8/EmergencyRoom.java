package org.example.review8;

import org.example.review8_1.Orthodontist;

public class EmergencyRoom {
    public static void main(String[] args) {
        Doctor[] doc = {
                new Surgeon("John", "Doe", "Surgeon", 20, "Lexington,KY"),
                new Surgeon("Michael", "Jordan", "Surgeon", 20, "Georgetown,KY"),
                new Orthodontist("Josh", "Smith", "Orthodontist", 15)
        };

      /*doc[0].checkVitals();
      doc[0].checkVitals("Jane");
      doc[0].prescribeMedication("Pills");
       */

        for (int i = 0; i < doc.length; i++) {
            doc[i].checkVitals();
            doc[i].checkVitals("Jane");
            doc[i].prescribeMedication("Pills");
            System.out.println("   _________________________   ");
        }

        System.out.println("---------------Enchanced for loop--------------");

        for (Doctor d : doc) {

            d.checkVitals();
            d.checkVitals("Jack");
            d.prescribeMedication("Pain Killer");
            System.out.println("   _________________________   ");


        }

    }
}
