package bridge;

public class SuperRemoteController implements RemoteController{

    private ControlledDevice device;

    public void setDevice(ControlledDevice device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        //kod charakterystyczny dla konkretnego pilota
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    @Override
    public void changeChannel(int channel) {
        device.changeChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        int v = device.getVolume();
        if (v > volume){
            do{
                device.volumeDown();
                v--;
                System.out.println("Volume down");
            } while(v == device.getVolume() && device.getVolume() > volume);
        }
        if (v < volume){
            do{
                device.volumeUp();
                System.out.println("Volume up");
                v++;
            } while(v == device.getVolume() && device.getVolume() < volume);
        }
    }


}
