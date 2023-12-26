package org.example.homework;

public class HomeWork24 {
    /*Create a method createEmail(). Based on values of users firstName, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

        String createEmail(String firstname, String lastname, String emailType){
            String emailAdd = firstname+lastname+"@"+emailType+".com";
            return emailAdd;
        }

    public static void main(String[] args) {
            HomeWork24 id = new HomeWork24();
         String emailId = id.createEmail("John","Snow","gmail");
        System.out.println(emailId);
    }
}
