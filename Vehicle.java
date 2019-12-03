package csc241hw06;

import java.util.ArrayList;
import java.util.Arrays;

 public abstract class Vehicle {
	//Instance variables 
private String type;
private ArrayList<Package> packages;
private String id;

//Empty constructor
public Vehicle() {
	
}
//Constructor
public Vehicle(String t , String i) {
	this.type = t;
	//its a static array class that can be accessed--
	this.packages = new ArrayList<Package>();
	id = i;
}
//Getters
public String getType()                {return type;}
public Package[] getPackages(){Package[] arrPack = packages.toArray(new Package[packages.size()]);return arrPack;}

public String getID()                  {return id;}
//Adders/ adds the packages to the vehicle arrayList. 
public void addPackage(Package pack)   {packages.add(pack);}
}
