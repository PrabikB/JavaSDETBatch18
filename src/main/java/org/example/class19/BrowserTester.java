package org.example.class19;

public class BrowserTester {
    public static void main(String[] args) {
        //Chrome chrome = new Chrome();
        /*chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closeBrowser();*/

        //Firefox firefox = new Firefox();
        /*firefox.get("https://Amazon.com");
        firefox.performTest();
        firefox.closeBrowser();*/

        //Edge edge = new Edge();
        /*edge.get("https://Amazon.com");
        edge.performTest();
        edge.closeBrowser();*/

        //Safari safari = new Safari();
        /*safari.get("https://Amazon.com");
        safari.performTest();
        safari.closeBrowser();*/

        System.out.println("*************************");

        Chrome chrome = new Chrome();
        Firefox firefox = new Firefox();
        Edge edge = new Edge();
        Safari safari = new Safari();

        Browser[] bArr = {chrome,firefox,edge,safari};

        for (int i = 0; i < bArr.length; i++) {

            Browser b = bArr[i];
            b.get("https://Amazon.com");
            b.performTest();
            b.closeBrowser();
        }
        
    }
}