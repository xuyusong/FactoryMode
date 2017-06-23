package com.example.factory.abstractFactoty.innerClass;

public class AdidasStore extends ShoeStore {

	
	@Override
	public Shoe createShoe(String type){
		Shoe shoe = null ;
		//MaterialFactory materialFactory = new AdidasMaterialFactory(); 
		System.out.println("we create a pair Adidas shoe");
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
	private MaterialFactory materialFactory = new MaterialFactory(){

		@Override
		public String preCloth() {
			// TODO Auto-generated method stub
			System.out.println("prepare Adidas cloth");
			return "Adidas_Cloth";
		}

		@Override
		public String preModel() {
			// TODO Auto-generated method stub
			System.out.println("prepare Adidas Model");
			return "Adidas_Model";
		}
	};
}
