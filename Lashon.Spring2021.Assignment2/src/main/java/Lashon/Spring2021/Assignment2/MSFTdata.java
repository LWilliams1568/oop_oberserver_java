package Lashon.Spring2021.Assignment2;
import java.util.*;

public class MSFTdata implements Subject {
    private ArrayList observers;
    private int msft;
    
    public MSFTdata() {
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
            observer.update(msft);
	}
    }
	
    public void msftChanged() {
	notifyObservers();
    }
	
    public void setMSFTPrice(int msft) {
        this.msft = msft;
        msftChanged();
    }
	
    public float getMSFT() {
        return msft;
    }
    
  	
}