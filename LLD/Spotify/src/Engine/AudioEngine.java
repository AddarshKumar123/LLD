package Engine;

import Device.IAudioOutputDevice;
import Model.Song;

public class AudioEngine {
    private Song currentSong;
    private boolean songIsPaused;

    public AudioEngine(){
        this.currentSong=null;
        this.songIsPaused=false;
    }

    public String getCurrentSongTitle() {
        if (currentSong != null) {
            return currentSong.getTitle();
        }
        return "";
    }

    public boolean isPaused() {
        return songIsPaused;
    }

    public void play(IAudioOutputDevice audioOutputDevice,Song song){
        if(song==null){
            throw new RuntimeException("Cannot play a null song.");
        }

        if(songIsPaused && song==currentSong){
            songIsPaused=false;
            System.out.println("Resuming song: " + song.getTitle());
            audioOutputDevice.playAudio(song);
            return;
        }

        currentSong=song;
        songIsPaused=false;
        System.out.println("Playing song: " + song.getTitle());
        audioOutputDevice.playAudio(song);
    }

    public void pause(){
        if(currentSong==null){
            throw new RuntimeException("No song is currently playing to pause.");
        }
        if(songIsPaused){
            throw new RuntimeException("Song is already paused");
        }
        songIsPaused = true;
        System.out.println("Pausing song: " + currentSong.getTitle());
    }
}
