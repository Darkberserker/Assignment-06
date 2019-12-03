
package csc241hw06;

public class Taxable extends Product implements TaxableNY  {
	//Empty Constructor 
	public Taxable() {}
	
	//Super constructor for the class Product.
	public Taxable(String pn, String ib, double up, int q) 
	{super(pn, ib, up, q);}
	//Gets the quantity and price to get calculated 
	@Override
	public double getPrice() {
		double price = getQuantity() * getUnitPrice();//Takes two variables then place it in the double variable "price"
		return getSalesTax(price) + price;//Puts the calculated price into another method to get the tax then brings it back
		//from the method to then add the regular price to the tax
		}
    //Takes the interface method to take in a value to then  be multiplied by the constant variable
	@Override
	public double getSalesTax(double productPrice){
		return productPrice * taxRateNY;
		}	
}
