package org.example.class4;

public class E1NestedIfCondition {
    public static void main(String[] args) {

        boolean isMainDoorOpened = true;
        boolean isRoom1Opened = true;
        boolean isRoom2Opened = true;

        if (isMainDoorOpened) {

            if (isRoom1Opened) {
                System.out.println("we are in Room 1");
            } else {
                System.out.println("Room 1 is closed");

            }
            if (isRoom2Opened) {
                System.out.println("We are in the Roon 2");

            } else {
                System.out.println("Room 2 is closed");
            }
        }else{
            System.out.println("Can't enter the house, the main door is closed");
        }
    }
}



