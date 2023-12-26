package org.example.projectTask;

public class Temperature {
    /* Create a program that uses an array to store a list of temperatures for a week,
       and then uses a loop to find the highest and lowest temperature for the week.
     */
    public static void main(String[] args) {
        double [] tempOfWeek = {75.2, 68.5, 65, 73.7, 78.3, 60.4, 63};
        double highestTemp = tempOfWeek[0], lowestTemp = tempOfWeek[0];


        for ( int i = 0; i<tempOfWeek.length; i++){
            if(tempOfWeek[i] > highestTemp){
                highestTemp = tempOfWeek[i];
            }else if (tempOfWeek[i] < lowestTemp){
                lowestTemp = tempOfWeek [i];
            }
        }
        System.out.println("The highest temperature of the week is " + highestTemp+ "F");
        System.out.println("The lowest temperature of the week is "+ lowestTemp+ "F");

    }
}
