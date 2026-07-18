import enums.DeviceType;

public class Main {
    public static void main(String[] args) {
        MusicPlayerApplication musicPlayerApplication=MusicPlayerApplication.getInstance();

        musicPlayerApplication.connectAudioDevice(DeviceType.BLUETOOTH);
    }
}