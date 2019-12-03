package csc241hw06;

public class Scooter extends Vehicle{
	//Empty constructor 
	public Scooter() {}
	
	public Scooter(String t, String i) {super(t, i);}
	@Override 
	public String getType() {
		String typeScooter= "Scooter";
		return typeScooter;
	}
}