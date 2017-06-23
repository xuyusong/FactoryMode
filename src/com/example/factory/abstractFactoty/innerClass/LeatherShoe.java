package com.example.factory.abstractFactoty.innerClass;

public class LeatherShoe extends Shoe {

	private MaterialFactory materialFactory; 
	
	public LeatherShoe(){}
	
	public LeatherShoe(MaterialFactory materialFactory){
		this.materialFactory = materialFactory;
	}
	@Override
	public void prepare(){
		System.out.println("LeatherShoe_prepare");
		if(materialFactory != null){
			materialFactory.preCloth();
			materialFactory.preModel();
		}
	}
	
	@Override
	public void cut(){
		System.out.println("LeatherShoe_cut");
	}
	
	@Override
	public void assemble(){
		System.out.println("LeatherShoe_assemble");
	}
}
