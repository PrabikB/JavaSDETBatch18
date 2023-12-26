package org.example.class19;

class Browser{
    void get(String url){
        System.out.println("Loading... "+url+" in Browser");
    }
    void performTest(){
        System.out.println("Checking if website is properly in Browser");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }
}
public class Chrome extends Browser{

    void get(String url){
        System.out.println("Loading... "+url+" in Chrome");
    }
    void performTest(){
        System.out.println("Checking if website is properly in Chrome");
    }
    void closeBrowser(){
        System.out.println("Closing the Google Chrome Browser");
    }
}
class Firefox extends Browser{
    void get(String url){
        System.out.println("Loading... "+url+" in Firefox");
    }
    void performTest(){
        System.out.println("Checking if website is properly in Firefox");
    }
    void closeBrowser(){
        System.out.println("Closing the Firefox Browser");
    }
}
class Edge extends Browser{
    void get(String url){
        System.out.println("Loading... "+url+" in Microsoft Edge");
    }
    void performTest(){
        System.out.println("Checking if website is properly in Microsoft Edge");
    }
    void closeBrowser(){
        System.out.println("Closing the Microsoft Edge Browser");
    }
}

class Safari extends Browser{
    void get(String url){
        System.out.println("Loading... "+url+" in Safari");
    }
    void performTest(){
        System.out.println("Checking if website is properly in Safari");
    }
    void closeBrowser(){
        System.out.println("Closing the Safari Browser");
    }
}
