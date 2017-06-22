package com.example.factory.abstractFactoty;


public class NikeStore extends ShoeStore {

	@Override
	public Shoe createShoe(String type){
		Shoe shoe = null ;
		MaterialFactory materialFactory = new  NikeMaterialFactory();
		System.out.println("we create a pair Nike shoe");
		switch (type){
			case "High" :
				shoe =new HighShoe(materialFactory);
				break;
			case "Leather" :
				shoe = new LeatherShoe(materialFactory);
				break;
			case "Sport" :
				shoe = new SportShoe(materialFactory);
				break;
		}		
		return shoe;
	}
}
