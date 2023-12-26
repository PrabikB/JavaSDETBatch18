package org.example.class19;

public class Computers {

        private String name;
        private int price;
        private int memory;

        public Computers(String name, int price, int memory) {
            this.name = name;
            this.price = price;
            this.memory = memory;
        }
        public void printInfo(){
            System.out.println(name+" "+price+" "+memory);
        }
        public void browseInternet(){
            System.out.println("Open the link");
        }
        public void playVideo(){
            System.out.println("Open the video");
        }
    }
    class AppleC extends Computers{
        public AppleC(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void playVideo(){
            System.out.println("Open the video on Apple computer");
        }
    }
    class LenovoC extends Computers{
        public LenovoC(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void browseInternet(){
            System.out.println("Open the link on Lenovo");
        }
    }
    class HPC extends Computers{
        public HPC(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void browseInternet(){
            System.out.println("Open the link on HP");
        }
    }
    class DellC extends Computers{
        public DellC(String name, int price, int memory) {
            super(name, price, memory);
        }
        public void playVideo(){
            System.out.println("Open the video on Dell computer");
        }
    }

