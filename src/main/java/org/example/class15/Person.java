package org.example.class15;

public class Person {

    String name;
    int age;
    double weight;
    double salary;
    String favLanguage;

    public Person(String pName,int pAge,double pWeight,double pSalary,String pFavLan){
        name =pName;
        age = pAge;
        weight = pWeight;
        salary = pSalary;
        favLanguage = pFavLan;
    }
    public Person(String pName,int pAge,double pWeight,double pSalary){
        name =pName;
        age = pAge;
        weight = pWeight;
        salary = pSalary;
    }
    public Person(String pName,int pAge,double pWeight){
        name =pName;
        age = pAge;
        weight = pWeight;
    }

    public void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
