package Lashon.Spring2021.Assignment2;

public class Trader2 implements Observer, DisplayElement {
    private int price;
    private Subject AAPLdata;
	
    public Trader2(Subject AAPLdata) {
	this.AAPLdata = AAPLdata;
	AAPLdata.registerObserver(this);
    }
	
    public void update(int price) {
	this.price= price;
	
    }
	
    public void display() {
	System.out.println("Current price: " + price);
    }
}
