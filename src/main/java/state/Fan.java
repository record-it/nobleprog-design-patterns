package state;

public class Fan {
    private int speed;

    private boolean isPower;
    FanState currentState = new OffFanState(this);

    public void setCurrentState(FanState state){
        currentState = state;
    }

    public void pushButton(){
        currentState.operate();
    }

    @Override
    public String toString() {
        return "speed=" + speed;
    }

    void powerOn(){
        isPower = true;
    }

    void powerOff(){
        isPower = false;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }
}
