package org.example.review7;

public class Task1 {

    static int arr(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arr(new int[]{10,20,30}));

    }


}
