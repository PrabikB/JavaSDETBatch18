package org.example.class8;

public class E4Continue {
    public static void main(String[] args) {

        int[] ages = {5, 3, 10, 25, 45, 80, 90, 60, 45, 28};
        for (int i = 0; i < ages.length; i++) {
            if (ages[i]>=0 && ages[i]<=30 ) {
                System.out.println("No discount");
                continue;
            }
                if (ages[i] < 90 && ages[i] > 80) {
                    System.out.println("80% off discount");
                } else if (ages[i] > 70 && ages[i] <= 80) {
                    System.out.println("70% off discount");
                } else if (ages[i] > 60 && ages[i] <= 70) {
                    System.out.println("60% off discount");
                } else if (ages[i]>50 && ages[i]<=60){
                    System.out.println("50% off discount");
                }else if(ages[i]>40 && ages[i]<=50){
                    System.out.println("40% off discount");
                }else if(ages[i]>30 && ages[i]<=40){
                    System.out.println("30% off discount");
                }
            }
        }
    }
