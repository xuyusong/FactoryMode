package com.example.factory.simpleFactory;

public class LeatherShoe extends Shoe {

	public LeatherShoe(){}
	
	@Override
	public void prepare(){
		System.out.println("LeatherShoe_prepare");
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
