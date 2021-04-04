package Lashon.Spring2021.Assignment2;
import java.util.*;

public class GOOGdata implements Subject {
    private ArrayList observers;
    private int goog;
    
	
    public GOOGdata() {
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
            observer.update(goog);
	}
    }
	
    public void googChanged() {
	notifyObservers();
    }
	
    public void setGoogPrice(int goog) {
	this.goog = goog;
	googChanged();
    }
	
    public float getGoog() {
	return goog;
    }
	
  
	
}