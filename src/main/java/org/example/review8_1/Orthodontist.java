package org.example.review8_1;

import org.example.review8.Doctor;

public class Orthodontist extends Doctor {
   public Orthodontist(String firstname,String lastname,String speciality,int yearsOfExperiance){
        super(firstname, lastname, speciality, yearsOfExperiance);
    }
    public void printSpeciality(){
        System.out.println("I am "+speciality);
    }
    public void prescribeMedication(String medication){
        System.out.println(speciality+" prescribes special medication "+medication);
    }
}
