package state;

public class Fan {
    int speed;
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
}
