package org.example.class8;

public class Task1 {
    public static void main(String[] args) {
        // write a programm to count how many times the Zeeshan as
        // appeared in this array

        String[] names = {"Adios", "Zeeshan", "Abid", "Sharif", "Zeeshan"};
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Zeeshan")) {
                count++;
            }
        }
        System.out.println("Zeeshan appeared " + count + " times");

    }
}