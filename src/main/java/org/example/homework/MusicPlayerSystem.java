package org.example.homework;

public class MusicPlayerSystem {
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player("Wish you were here",60);
        mp3.play();
        mp3.pause();
        mp3.stop();
        System.out.println("*************************************");
        CDPlayer cd = new CDPlayer("Imagine",55);
        cd.play();
        cd.pause();
        cd.stop();
        System.out.println("*************************************");
        StreamingPlayer sp = new StreamingPlayer("Wonderful World",50);
        sp.play();
        sp.pause();
        sp.stop();
    }
}
