package org.example.class9;

public class Task3 {
    public static void main(String[] args) {
        String[][] nameGrade={
            {"John","Sam","David","Paul"},
            {"A","B","A","D"}
        };
        for(int i=0; i<nameGrade[0].length;i++){
            if(nameGrade[1][i].equals("A") || nameGrade[1][i].equals("B"))
            System.out.println(nameGrade[0][i]+" "+nameGrade[1][i]);
        }
            }

    }


