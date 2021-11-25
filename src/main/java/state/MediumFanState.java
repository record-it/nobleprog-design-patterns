package state;

public class MediumFanState implements FanState{
    Fan context;
    static final int SPEED = 2000;

    public MediumFanState(Fan context) {
        this.context = context;
        context.speed = SPEED;
    }

    @Override
    public void operate() {
        context.setCurrentState(new HighFanState(context));
    }
}
