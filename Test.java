package csc241hw06;

import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Test {
public static void main(String[] args) {
	double packageTotal = 0;
	ArrayList<Product> listProd = new ArrayList<Product>();
	NumberFormat moneyValue = NumberFormat.getCurrencyInstance(Locale.US);
	//Variable name to take the user's input.
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please input the file you wish to access:");
	
	
	String fileInput = userInput.nextLine();
	 SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
     try {
         SAXParser saxParser = saxParserFactory.newSAXParser();
         Handler handler = new Handler();
         File input = new File(fileInput);
         saxParser.parse(input, handler);
         HashMap<String, Product> db = handler.getDatabase();
         List<String> prodLine = new ArrayList<>(db.keySet());
         
         
         //Counting Products 
         long prodCount = prodLine.stream().count();
         System.out.println("Count of Products:"+prodCount);
         System.out.println("Sorted Product Names: ");
         prodLine.stream().distinct().sorted().forEach(System.out:: println);
         //To print out the report 
         /*
         System.out.println("------REPORT------");
         for(Vehicle v: handler.getVehicles()) {
        	 System.out.println(v.getType()+":"+v.getID());
        	 System.out.println("\t Customers");
        	 
        	 //getting packages
        	 for(Package pk: v.getPackages()) {
        		 Customer c = pk.getCustomer();
        		 System.out.println("\t\t\t"+c.getLastName()+","+c.getFirstName()+"at"+c.getStreetAddress()+","+c.getZipCode());
        	 }
        	 for(Package pk: v.getPackages()) {
        		 packageTotal = packageTotal+ pk.getTotal();
        	 }
        	 System.out.println("total");
        	 System.out.println("\t\t"+ moneyValue.format(packageTotal));
        	 
        	 packageTotal = 0;
        	 
         }
         */
         
         //The end of the for loop for the total.
         //System.out.println("------END------");
         //Start
         /*
         HashMap<String, Product> db = handler.getDatabase();
         String isbnInput = "";
         do {
        	 System.out.println("Enter the ISBN:");
        	  isbnInput = userInput.nextLine();
        	 if(db.get(isbnInput)== null){
        		 System.out.println("No product information found for:"+isbnInput);
        	 }else {
        		 System.out.println("Product Informatiom:" + db.get(isbnInput).toString());
        	 }
         }while(!isbnInput.equals("EXIT"));
         System.out.println("Program Ended");
         //End
         */
     } catch (Exception e) {
         e.printStackTrace();
     }
     
	
}


}
