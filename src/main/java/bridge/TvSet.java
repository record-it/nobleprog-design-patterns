package bridge;

public class TvSet implements ControlledDevice{
    private final RemoteController controller;

    public TvSet(RemoteController controller) {
        this.controller = controller;
    }

    @Override
    public void changeChannel() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void powerOn() {

    }

    @Override
    public void poweOff() {

    }
}
