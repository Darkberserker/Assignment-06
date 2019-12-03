package csc241hw06;
public class Drone extends Vehicle{
 //Empty Constructor
	public Drone() {}
	//Populated constructor 
	public Drone(String t, String i) {super(t, i);}
@Override
public String getType() {
	String typeDrone = "Drone";
	return typeDrone;
}
	
}
