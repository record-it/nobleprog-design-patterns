package state;

public class LowFanState implements FanState{
    Fan context;
    static final int SPEED = 1000;

    public LowFanState(Fan context) {
        this.context = context;
        context.speed = SPEED;
    }

    @Override
    public void operate() {
        context.setCurrentState(new MediumFanState(context));
    }
}
