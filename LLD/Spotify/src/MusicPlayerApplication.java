import enums.DeviceType;

public class MusicPlayerApplication {
    private MusicPlayerApplication(){

    }

    private static class singletonHelper{
        private static final MusicPlayerApplication INSTANCE = new MusicPlayerApplication();
    }

    public static MusicPlayerApplication getInstance(){
        return singletonHelper.INSTANCE;
    }

    public void connectAudioDevice(DeviceType deviceType){
        MusicPlayerFacade.getInstance().connectDevice(deviceType);
    }
}
