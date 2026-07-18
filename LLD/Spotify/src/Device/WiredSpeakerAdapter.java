package Device;

import ExternalAPI.WiredSpeakerAPI;
import Model.Song;

public class WiredSpeakerAdapter implements IAudioOutputDevice{
    WiredSpeakerAPI wiredSpeakerAPI;

    public WiredSpeakerAdapter(WiredSpeakerAPI wiredSpeakerAPI){
        this.wiredSpeakerAPI=wiredSpeakerAPI;
    }
    @Override
    public void playAudio(Song song) {
        String payload = song.getTitle() + " by " + song.getArtist();
        wiredSpeakerAPI.playSoundViaCable(payload);
    }
}
