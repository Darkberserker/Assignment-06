package csc241hw06;


public class Cart extends Vehicle{
	//Empty constructor 
	public Cart() {}
	//Populated 
	public Cart(String t, String i) {super(t, i);}
	@Override
	public String getType() {
		String typeCart = "Cart";
		return typeCart;
	}
}