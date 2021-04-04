package Lashon.Spring2021.Assignment2;

public class Trader4 implements Observer, DisplayElement {
    private int price;
    private Subject GOOGdata;
	
    public Trader4(Subject GOOGdata) {
	this.GOOGdata = GOOGdata;
	GOOGdata.registerObserver(this);
    }
	
    public void update(int price) {
	this.price= price;
	
    }
	
    public void display() {
	System.out.println("Current price: " + price);
    }
}
