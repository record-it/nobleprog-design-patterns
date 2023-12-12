package state;

public class HighFanState implements  FanState{
    Fan context;
    static final int SPEED = 5000;

    public HighFanState(Fan context) {
        this.context = context;
        context.setSpeed(SPEED);
    }

    @Override
    public void operate() {
        context.setCurrentState(new OffFanState(context));
    }
}
