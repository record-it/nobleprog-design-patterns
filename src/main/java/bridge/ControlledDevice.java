package bridge;

public interface ControlledDevice {
    void changeChannel(int channel);
    void volumeUp();
    void volumeDown();
    int getVolume();
    void powerOn();
    void powerOff();
}
