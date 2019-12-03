package csc241hw06;

public class NonTaxable extends Product {
	//empty constructor
	public NonTaxable() {}
	//populated constructor 
	public NonTaxable(String pn, String ib, double up, int q){
		//Super constructor of Non-Taxable
		super(pn, ib, up, q);
		}
	//Only multiplies the quantity and price without tax
	public double getPrice() {
		double notTaxPrice = getUnitPrice() *getQuantity();
		return notTaxPrice;
		}
	
}
