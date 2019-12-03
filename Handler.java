package csc241hw06;
  
import org.xml.sax.*;   
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Handler extends DefaultHandler{
	Customer currentCustom;
	Package currentPack;
	Vehicle currentVehicle;
	List<Product> currentProd = new ArrayList<>();
	//ArrayList<Product> xmlProd = new ArrayList<>(currentProd);
	//ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
//	private String id;
//    private String type;
	private boolean tax;
//    private String prodName;
//    private String isBN; 
//    private double uniPrice;
//    private int quantityAmt; 
//Array list variables to store the values through the loop 
//ArrayList<Product> aListOfProducts = new ArrayList<>();
//ArrayList<Vehicle> aListOfVehicles = new ArrayList<>();
boolean deliveryVehicle;

public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
		//START ELEMENT\\
		//If statement when reading the "van" tag
		//if(qName.equals("van")){currentVehicle = new Van("Van", attributes.getValue("id"));}
		//START ELEMENT\\
		//if(qName.equals("drone")) {currentVehicle = new Drone("Drone", attributes.getValue("id"));}
		//START ELEMENT\\
		//if(qName.equals("cart")) {currentVehicle = new Cart("Cart", attributes.getValue("id"));}
		//START ELEMENT\\
		//if(qName.equals("scooter")){currentVehicle = new Scooter("Scooter", attributes.getValue("id"));}
		//HEAVIER CODEs for the assignment 
		//START ELEMENT\\
		if(qName.equals("product")) {
			
			tax = Boolean.parseBoolean(attributes.getValue("taxable"));
			if (tax) {
				currentProd.add( new Taxable(attributes.getValue("productName"), 
						attributes.getValue("isbn"),
						Double.parseDouble(attributes.getValue("unitPrice")),
						Integer.parseInt(attributes.getValue("quantity"))));
			}
			else{
				currentProd.add( new NonTaxable(attributes.getValue("productName"), 
						attributes.getValue("isbn"),
						Double.parseDouble(attributes.getValue("unitPrice")),
						Integer.parseInt(attributes.getValue("quantity"))));
			}
		
		}
		/*
		if(qName.equals("customer")){
			currentCustom = new Customer(attributes.getValue("lastName"), 
					attributes.getValue("firstName"), attributes.getValue("streetAddress"), 
					attributes.getValue("zipCode"),attributes.getValue("accountNumber"));
			System.out.println(currentCustom);
		}
		if(qName.equals("package")) {
			currentPack = new Package(attributes.getValue("trackingNumber"),attributes.getValue("type"),null);
		}
	*/
}
public void endElement(String uri,String localName, String qName)throws SAXException{
	/*
	if(qName.equals("van") || qName.equals("cart")|| qName.equals("scooter")||qName.equals("drone")){
     listOfVehicles.add(currentVehicle);
	}
		//adds the product to the package 
	if(qName.equals("product")) {
		currentPack.addProduct(currentProd);
	}
	//Sets the customer to the associated package and products 
	if(qName.equals("customer")) {
		currentPack.setCustomer(currentCustom);
	}
	//Adds the package to the associated vehicle
	if(qName.equals("package")) {
		currentVehicle.addPackage(currentPack);
	}
	*/
}
//Getters
/*
public ArrayList<Vehicle> getVehicles(){
	return listOfVehicles;
}
*/

public HashMap<String, Product> getDatabase(){
	HashMap<String, Product> productData = new HashMap<>();
	for(Product prod: currentProd) {
		productData.put(prod.getProductName(),prod);
	}
	return productData;
}



}