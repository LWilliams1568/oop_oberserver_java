package Lashon.Spring2021.Assignment2;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
   
}
