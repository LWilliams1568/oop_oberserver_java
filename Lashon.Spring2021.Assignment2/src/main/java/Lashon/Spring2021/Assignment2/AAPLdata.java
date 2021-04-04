package Lashon.Spring2021.Assignment2;
import java.util.*;

public class AAPLdata implements Subject {
    private ArrayList observers;
    private int aapl;
 
	
    public AAPLdata() {
        observers = new ArrayList();
    }
	
    public void registerObserver(Observer o) {
        observers.add(o);
    }
	
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
	
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(aapl);
        }
    }
	
    public void aaplChanged() {
        notifyObservers();
    }
	
    public void setAAPLprice(int aapl) {
        this.aapl = aapl;
        aaplChanged();
    }
	
    public float getAAPL() {
        return aapl;
    }	
    
}