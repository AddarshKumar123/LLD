import Device.IAudioOutputDevice;
import Engine.AudioEngine;
import Managers.DeviceManager;
import Model.Song;
import enums.DeviceType;

public class MusicPlayerFacade {
    AudioEngine audioEngine;
    private MusicPlayerFacade(){
        audioEngine=new AudioEngine();
    }

    private static class singletonHelper{
        private static final MusicPlayerFacade INSTANCE=new MusicPlayerFacade();
    }

    public static MusicPlayerFacade getInstance(){
        return singletonHelper.INSTANCE;
    }

    public void connectDevice(DeviceType deviceType){
        DeviceManager.getInstance().connect(deviceType);
    }

    public void playSong(Song song){
        if(!DeviceManager.getInstance().hasOutputDevice()){
            throw new RuntimeException("No audio device connected.");
        }

        IAudioOutputDevice device=DeviceManager.getInstance().getOutputDevice();
        audioEngine.play(device,song);
    }

    public void pauseSong(Song song) {
        if (!audioEngine.getCurrentSongTitle().equals(song.getTitle())) {
            throw new RuntimeException("Cannot pause \"" + song.getTitle() + "\"; not currently playing.");
        }
        audioEngine.pause();
    }
}
