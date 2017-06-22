package com.example.factory.abstractFactoty;

public class SportShoe extends Shoe{

private MaterialFactory materialFactory; 
	
	public SportShoe(){}
	
	public SportShoe(MaterialFactory materialFactory){
		this.materialFactory = materialFactory;
	}
	@Override
	public void prepare(){
		System.out.println("SportShoe_prepare");
		if(materialFactory != null){
			materialFactory.preCloth();
			materialFactory.preModel();
		}
	}
	
	@Override
	public void cut(){
		System.out.println("SportShoe_cut");
	}
	
	@Override
	public void assemble(){
		System.out.println("SportShoe_assemble");
	}
}
