package org.example.class8;

public class Task2 {
    public static void main(String[] args) {
        /* to count how many numbers are divisible by
           5 and how many are divisible by 2
         */
        int[] numbers={101,100,25,30,25,50,300};
        int divisible5=0;
        int divisible2=0;

        for(int i : numbers){
            if(i %5==0){
                divisible5++;
            }
            if(i %2==0){
                divisible2++;
            }
        }
        System.out.println("Numbers divisible by 5 are "+divisible5);
        System.out.println("Numbers divisible by 2 are "+divisible2);

    }

}
