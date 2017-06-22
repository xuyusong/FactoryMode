package com.example.factory.abstractFactoty;

public class HighShoe extends Shoe {

	private MaterialFactory materialFactory; 
	
	public HighShoe(){}
	
	public HighShoe(MaterialFactory materialFactory){
		this.materialFactory = materialFactory;
	}
	@Override
	public void prepare(){
		System.out.println("HighShoe_prepare");
		if(materialFactory != null){
			materialFactory.preCloth();
			materialFactory.preModel();
		}
	}
	
	@Override
	public void cut(){
		System.out.println("HighShoe_cut");
	}
	
	@Override
	public void assemble(){
		System.out.println("HighShoe_assemble");
	}
}
