package bridge;

public class SuperRemoteController implements RemoteController{

    private final ControlledDevice device;

    public SuperRemoteController(ControlledDevice device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        //kod charakterystyczny dla konkretnego pilota
        device.powerOn();
    }

    @Override
    public void powerOff() {

    }
}
