package ObserverDesignPattern;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer o){
        observers.add(o);
    }
    public void dettach(Observer o){
        observers.remove(o);
    }

    public void notify_(){
        for (Observer o:observers){
            o.update_(this);
        }
    }
}
