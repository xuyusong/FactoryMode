package com.example.factory.factoryMethod;


public class NikeStore extends ShoeStore {

	@Override
	public Shoe createShoe(String type){
		Shoe shoe = null ;
		System.out.println("we create a pair Nike shoe");
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
