package org.example.homework;

public class HomeWork21 {
    /* Create 2D array of countries: north america countries, south america countries,
    europe countries, asian countries, african countries. Then print all values from
    that array using 2 different loops and calculate how many total countries been stored.
     */
    public static void main(String[] args) {

        String[][] countries = {
                {"USA", "Canada", "Mexico", "Cuba"},
                {"Brazil", "Argentina", "Columbia", "Uruguay"},
                {"France", "Switzerland", "Italy", "Germany"},
                {"Nepal", "India", "Pakistan", "Japan"},
                {"Egypt", "Nigeria", "Ghana", "Kenya"}};

            for (int i = 0; i < countries.length; i++){
                for (int j=0; j< countries[i].length; j++){
                    System.out.print(countries[i][j]+" ");
                }
                System.out.println();
            }
                System.out.println();
        System.out.println("-----using enhanced for loop-----");
        for (String[] name:countries) {
            for (String countryName : name) {
                System.out.print(countryName + " ");
            }
            System.out.println();
        }
            System.out.println();
            int sum = 0;
            for (String [] cName:countries){
                sum +=cName.length;
        }
        System.out.println("The total countries stored in 2d array is: "+sum);
    }
}
