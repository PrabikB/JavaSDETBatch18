package org.example.class19;

public class ComputersTester {

        public static void main(String[] args) {
            Computers [] arr={new AppleC("Apple",1000,250),new DellC("Dell",2000,250),new HPC("HP",1000,250),new LenovoC("Lenovo",1000,250)};
            for (Computers c: arr){
                c.printInfo();
                c.playVideo();
                c.browseInternet();

            }
        }
    }


