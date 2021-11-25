package state;

public class OffFanState implements FanState {
    Fan context;
    static final int SPEED = 0;

    public OffFanState(Fan context) {
        this.context = context;
        context.speed = SPEED;
    }

    @Override
    public void operate() {
        context.setCurrentState(new LowFanState(context));
    }
}
