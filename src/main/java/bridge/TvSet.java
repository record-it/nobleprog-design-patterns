package bridge;

public class TvSet implements ControlledDevice{
    private static final int MAX_VOLUME = 100;
    private int volume;
    private final RemoteController controller;

    public TvSet(RemoteController controller) {
        this.controller = controller;
    }

    @Override
    public void changeChannel(int i) {
        System.out.println("Sony tv set, changing channel to 1");
    }

    @Override
    public void volumeUp() {
        volume += volume < MAX_VOLUME ? 1 : 0;
        System.out.println("Sony tv set, volume up");
    }

    @Override
    public void volumeDown() {
        volume -= volume > 0 ? 1 : 0;
        System.out.println("Sony tv set, volume down");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void powerOn() {
        System.out.println("Sony tv set, power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Sony tv set, power off");
    }
}
