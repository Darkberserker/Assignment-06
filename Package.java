package csc241hw06;
import java.time.LocalDateTime; 
import java.util.ArrayList;

public class Package{
	
	//Instance variables 
private String trackingNumber;
private String type;
private ArrayList<Product> products;
private double weight; 
private Customer customer;
private LocalDateTime timeOfDelivery;
private LocalDateTime deliveryAttempt;
private boolean delivered;
private boolean undelivered;

//empty constructor 
public Package() {}

//Constructor

public Package(String tn, String t, Customer c) {
	this.trackingNumber = tn;
	this.type = t;
	this.customer = c;
	weight = 0;
	timeOfDelivery = null;
	deliveryAttempt = null;
	products = new ArrayList<>();
}
//Getters 
public void setCustomer(Customer cs) {
	this.customer = cs;
}
 public String getTrackingNumber(){
	 return trackingNumber;
} 
 
 public String getType(){
	 return type; 
}
 
 public Product[] getProducts(){
	 // declare empty array
	 Product[] productArray = new Product[products.size()];
	 // copy values
	 productArray = products.toArray(productArray);
	 return productArray;
 }
 //Supposed to calculate the given price of the list of products.
 //for each loop for the products of the 
 public double getTotal() {
	 //for each loop that takes each product in the array to get each price 
   double packageTotal= 0;
   for(Product p: getProducts()) {
	   packageTotal += p.getPrice();
   }
   	   return packageTotal;
 }
 //Adds each product in an array list
 public void addProduct(Product p){
	 products.add(p);
	 }
 
 public double getWeight(){
	 return weight; 
	 }
 //When receiving the weight of the product.
 public void setWeight(double w)           {weight = w;}
 public Customer getCustomer()             {return customer;}
 //to estimate the time of delivery 
 public LocalDateTime getDeliveryTime()    {return timeOfDelivery;}
 public LocalDateTime getDeliveryAttempt() {return deliveryAttempt;}

 //Runs through the boolean if statement in getDelivery
 public void markDelivered() {
	 delivered = true;
    timeOfDelivery = LocalDateTime.now();
 }
 public void markUndelivered(){
	 undelivered = false;
	 deliveryAttempt = LocalDateTime.now();
 }
}
