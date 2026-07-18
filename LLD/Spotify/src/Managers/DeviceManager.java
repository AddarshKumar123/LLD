package Managers;

import Device.BluetoothSpeakerAdapter;
import Device.HeadphonesAdapter;
import Device.IAudioOutputDevice;
import Device.WiredSpeakerAdapter;
import ExternalAPI.BluetoothSpeakerAPI;
import ExternalAPI.HeadPhonesAPI;
import ExternalAPI.WiredSpeakerAPI;
import enums.DeviceType;

public class DeviceManager {
    private IAudioOutputDevice audioOutputDevice;
    private DeviceManager(){
        audioOutputDevice=null;
    }

    private static class singletonHelper{
        private static final DeviceManager INSTANCE = new DeviceManager();
    }

    public static DeviceManager getInstance(){
        return singletonHelper.INSTANCE;
    }

    public void connect(DeviceType deviceType){
        if(deviceType==DeviceType.BLUETOOTH){
            audioOutputDevice=new BluetoothSpeakerAdapter(new BluetoothSpeakerAPI());
            System.out.println("Bluetooth device connected ");
        }else if(deviceType==DeviceType.HEADPHONES){
            audioOutputDevice=new HeadphonesAdapter(new HeadPhonesAPI());
            System.out.println("Headphone connected ");
        }else if(deviceType==DeviceType.WIRED){
            audioOutputDevice=new WiredSpeakerAdapter(new WiredSpeakerAPI());
            System.out.println("Wired device connected ");
        }
    }

    public IAudioOutputDevice getOutputDevice() {
        if (audioOutputDevice == null) {
            throw new RuntimeException("No output device is connected.");
        }
        return audioOutputDevice;
    }

    public boolean hasOutputDevice() {
        return audioOutputDevice != null;
    }
}
