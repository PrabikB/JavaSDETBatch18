package org.example.class11;

public class Task1 {
    /* Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
     */
    public static void main(String[] args) {
         String username = "Bikal";
         String password = "pAssWord*";
         String confirmPassword = "pAssWord*";

         if(username.isEmpty() || password.isEmpty() ){
             System.out.println("Username and password cannot be empty");
         }else if(password.length()<8) {
             System.out.println("Password is too short");
         }else if( password.contains(username)){
             System.out.println("Password cannot contain username");
         }else if(!password.equals(confirmPassword)){
             System.out.println("Password do not matched");
         }else {
             System.out.println("Your username and password has been created");
         }
    }
}
