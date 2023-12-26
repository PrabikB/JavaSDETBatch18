package org.example.class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone mobile = new Phone();

        mobile.name = "Samsung";
        mobile.model = "S22 Ultra";
        mobile.color = "White";
        mobile.price = 1600;
        mobile.storage = "1TB";

        System.out.println(mobile.name);
        System.out.println(mobile.model);
        System.out.println(mobile.color);
        System.out.println(mobile.price);
        System.out.println(mobile.storage);

        mobile.network();
        mobile.videoQuality();
        mobile.call();

        System.out.println("-------************----------");

        mobile.name = "iPhone";
        mobile.model = "14 Pro Max";
        mobile.color = "Gold";
        mobile.price = 1500;
        mobile.storage = "1TB";

        System.out.println(mobile.name);
        System.out.println(mobile.model);
        System.out.println(mobile.color);
        System.out.println(mobile.price);
        System.out.println(mobile.storage);

        mobile.network();
        mobile.videoQuality();
        mobile.call();

        System.out.println("-------************----------");

        mobile.name = "Pixel";
        mobile.model = "8 Pro ";
        mobile.color = "Black";
        mobile.price = 1200;
        mobile.storage = "512GB";

        System.out.println(mobile.name);
        System.out.println(mobile.model);
        System.out.println(mobile.color);
        System.out.println(mobile.price);
        System.out.println(mobile.storage);

        mobile.network();
        mobile.videoQuality();
        mobile.call();
    }
}
