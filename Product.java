package csc241hw06;

public abstract class Product {
	//Instance Variables 
private String productName;
private String isBN; 
private double unitPrice;
private int quantity;

//Empty Constructor 
public Product() {}
//Constructor that 
public Product(String pn, String ib, double up, int q) {
	productName = pn;
	isBN = ib;
	unitPrice = up;
	quantity = q;
}
@Override
public String toString() {
	return "[ Name:"+productName+"; "+"ISBN:"+ isBN+"; "+"Price:"+unitPrice+" ]";
}
public abstract double getPrice();
//Getters for the now public 
public String getProductName() {return productName;} //Gets the product's name. 
public String getISBN()        {return isBN;} //Gets the product's number 
public double getUnitPrice()   {return unitPrice;} // Gets the price of the product 
public int getQuantity()       {return quantity;} //Gets the amount of how many the customer wants.
}



