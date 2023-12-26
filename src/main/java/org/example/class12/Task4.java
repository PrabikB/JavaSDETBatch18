package org.example.class12;

public class Task4 {

    public static void main(String[] args) {
        String fatherName = "Danial";
        String motherName = "Mary";
        boolean isBoy = false;

        if(isBoy){
            String fatherFirstPart=fatherName.substring(0,fatherName.length()/2);
            String motherLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(fatherFirstPart+motherLastPart);
        }else{
            String motherFirstName=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstName+fatherLastPart);
        }
    }
}
