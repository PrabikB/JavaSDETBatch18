package org.example.class8;

public class E1Arrays {
    public static void main(String[] args) {
        int[] num = {10, 25, 26, 30, 40, 45, 45};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 26) {
                System.out.print("Number 26 is present");
                break;
            }
        }
    }
}