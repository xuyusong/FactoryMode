package com.example.factory.simpleFactory;

public class SimpleShoeFactory {
	
	public static Shoe createShoe(String type){
		Shoe shoe = null ;
		switch (type){
			case "High" :
				shoe =new HighShoe();
				break;
			case "Leather" :
				shoe = new LeatherShoe();
				break;
			case "Sport" :
				shoe = new SportShoe();
				break;
		}		
		return shoe;
	}
}
