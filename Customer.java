package csc241hw06;

import java.util.ArrayList;

public class Customer {
	//Protected Instance Variables 
private String firstName;
private String lastName;
private String streetAddress;
private String zipCode;
private String accountNumber;

//empty constructor
public Customer() {
	
}
//Constructor

public Customer(String ln, String fn, String sa, String zc, String an) {
	firstName = fn;
	lastName  = ln;
	streetAddress = sa;
	zipCode = zc;
	accountNumber = an;
}

//Getters
public String getFirstName()     {return firstName;}
public String getLastName()      {return lastName;}
public String getStreetAddress() {return streetAddress;}
public String getZipCode()       {return zipCode;}
public String getAccountNumber() {return accountNumber;}

}
