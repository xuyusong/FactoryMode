package com.example.factory.abstractFactoty.innerClass;


public class NikeStore extends ShoeStore {

	@Override
	public Shoe createShoe(String type){
		Shoe shoe = null ;
		//MaterialFactory materialFactory = new NikeMaterialFactory();
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
	//内部类
	private MaterialFactory materialFactory = new MaterialFactory(){
		
			@Override
			public String preCloth() {
				// TODO Auto-generated method stub
				System.out.println("prepare Nike cloth");
				return "Nike_Cloth";
			}
	
			@Override
			public String preModel() {
				// TODO Auto-generated method stub
				System.out.println("prepare Nike Model");
				return "Nike_Model";
			}
	};
}
