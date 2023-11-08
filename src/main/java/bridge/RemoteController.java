package bridge;

public interface RemoteController {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
    void setVolume(int volume);

    void setDevice(ControlledDevice device);
}
