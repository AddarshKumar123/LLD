package Device;

import ExternalAPI.BluetoothSpeakerAPI;
import Model.Song;

public class BluetoothSpeakerAdapter implements IAudioOutputDevice{
    BluetoothSpeakerAPI bluetoothSpeakerAPI;

    public BluetoothSpeakerAdapter(BluetoothSpeakerAPI bluetoothSpeakerAPI){
        this.bluetoothSpeakerAPI=bluetoothSpeakerAPI;
    }
    @Override
    public void playAudio(Song song) {
        String payload = song.getTitle() + " by " + song.getArtist();
        bluetoothSpeakerAPI.playSoundViaBluetooth(payload);
    }
}
