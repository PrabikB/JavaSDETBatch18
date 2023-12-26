package org.example.review8;

public class Doctor {

    public static String hospital;
    public String firstname, lastname;
    protected String speciality;
    int yearsOfExperiance;
    private double salary;
   public Doctor(String firstname,String lastname,String speciality,int yearsOfExperiance ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.yearsOfExperiance = yearsOfExperiance;
    }
    public static void work(){
        System.out.println("Doctors work at "+hospital);
    }
    protected void checkVitals(){
        System.out.println(firstname+" "+lastname+" checks temperature on every patient");
    }
    /*
    What is method overloading -  in the same class we have method with same name
    How to overload - changing number of the parameters or dataType or sequence
    In overloading the method signature MUST be different
    we do not care about return type or access modifiers
     */
    void checkVitals(String patient){
        System.out.println(firstname+" "+lastname+" checks vitals on "+patient);
    }
    protected void prescribeMedication(String medication){
        System.out.println(firstname+" "+lastname+" prescribed "+medication);
    }
}
class Surgeon extends Doctor{
    String location;
    Surgeon(String firstname,String lastname,String speciality,int yearsOfExperiance,String location){
        super(firstname,lastname,speciality,yearsOfExperiance);
        this.location = location;
    }
    /*
    Method overriding - In subclass (child class) and parent class we have method with the same name
    How to override: - we need inheritance
                       Must keep same name, parameters and return type
    In overriding, Method Signature MUST be the same
     */
    public void prescribeMedication(String patient){
        System.out.println("Surgeon "+lastname+ " prescribed medication to "+patient);
    }
}

