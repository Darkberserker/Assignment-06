package csc241hw06;

public class Van extends Vehicle{
	//Empty Constructor 
	public Van() {}
	//Super constructor 
		public Van(String t, String i){
			super(t, i);
			}
		
		@Override
		public String getType() {
			String typeVan = "Van";
			return typeVan;
		}	
	}