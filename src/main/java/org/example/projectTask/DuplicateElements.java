package org.example.projectTask;

public class DuplicateElements {
    // Write a program to print out duplicate elements from an Array of Strings
    public static void main(String[] args) {

    String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter","Earth"};

        for (int i = 0; i < planets.length; i++) {
            for (int j = i+1; j <planets.length ; j++) {
                if(planets[i]==planets[j]){
                    System.out.println(planets[i]);
                }
            }
        }
    }
}
