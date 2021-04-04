package Lashon.Spring2021.Assignment2;

public class Trader3 implements Observer, DisplayElement {
    private int price;
    private Subject MSFTdata;
	
    public Trader3(Subject MSFTdata) {
	this.MSFTdata = MSFTdata;
	MSFTdata.registerObserver(this);
    }
	
    public void update(int price) {
	this.price= price;
	
    }
	
    public void display() {
	System.out.println("Current price: " + price);
    }
}
