package org.example.homework;

public class HomeWork25 {
    /*Hello in different language based on the country that will passed
    when method is executed. Do it for any five countries
     */
    void greet(String country){
        if(country.equalsIgnoreCase("Nepal")){
            System.out.println("Namaste");
        }else if(country.equalsIgnoreCase("Japan")){
            System.out.println("Konnichiwa");
        }else if(country.equalsIgnoreCase("France")){
            System.out.println("Bonjour");
        }else if(country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if(country.equalsIgnoreCase("Italy")){
            System.out.println("Ciao");
        }else{
            System.out.println("Unknown");
        }
    }
    public static void main(String[] args) {
        HomeWork25 greeting = new HomeWork25();
        greeting.greet("nepal");
    }
}
