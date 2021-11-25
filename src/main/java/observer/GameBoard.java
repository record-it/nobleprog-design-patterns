package observer;

import java.util.HashSet;
import java.util.Set;

public class GameBoard implements Subject {
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers(String event){
        observers.forEach(o -> o.update(event));
    }

    public void move(){
        notifyAllObservers("move");
    }

    public void action(){
        notifyAllObservers("action");
    }
}
