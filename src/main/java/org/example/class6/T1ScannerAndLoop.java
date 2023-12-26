package org.example.class6;

public class T1ScannerAndLoop {

    //write a loop to add first 10 numbers from
    // 1 to 10 = 1+2=3=4=5=6=7=8=9=10=55
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=10; i++ ){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println();

        int sum1 = 0;
        int i= 1;
        while(i<=10){
            sum1=sum1+i;
            i++;
            System.out.println(sum1);
        }


    }
}

