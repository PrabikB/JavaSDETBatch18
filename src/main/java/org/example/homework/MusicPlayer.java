package org.example.homework;

public abstract class MusicPlayer {
    private String currentTrack;
    private int volume;
    public MusicPlayer(String currentTrack,int volume){
        this.currentTrack = currentTrack;
        this.volume = volume;
    }
    public abstract void play();
    public void pause(){
        System.out.println("Press pause button to pause the song");
    }
    public void stop(){
        System.out.println("Your song has been stopped");
    }
}
class MP3Player extends MusicPlayer{
    public MP3Player(String currentTrack,int volume) {
        super(currentTrack, volume);
        }
        @Override
        public void play(){
            System.out.println("Streaming from the internet");
    }
}
class CDPlayer extends MusicPlayer{
    public CDPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }

    @Override
    public void play() {
        System.out.println("Playing from CD");
    }
}
class StreamingPlayer extends MusicPlayer{
    public StreamingPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }

    @Override
    public void play() {
        System.out.println("Streaming from Spotify");
    }
}
