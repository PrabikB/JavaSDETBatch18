package org.example.class9;

public class Task7 {
    public static void main(String[] args) {
        int[][] numbers = {{1,3,4,5,},
                {32,54,12,77},
                {89,65,33,8}};

        for(int i =0; i<numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++){
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }

        }
        System.out.println();
        }

    }

