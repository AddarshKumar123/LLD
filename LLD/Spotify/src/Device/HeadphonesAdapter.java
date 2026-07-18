package Device;

import ExternalAPI.HeadPhonesAPI;
import Model.Song;

public class HeadphonesAdapter implements IAudioOutputDevice{
    HeadPhonesAPI headPhonesAPI;

    public HeadphonesAdapter(HeadPhonesAPI headPhonesAPI){
        this.headPhonesAPI=headPhonesAPI;
    }
    @Override
    public void playAudio(Song song) {
        String payload = song.getTitle() + " by " + song.getArtist();
        headPhonesAPI.playSoundViaJack(payload);
    }
}
