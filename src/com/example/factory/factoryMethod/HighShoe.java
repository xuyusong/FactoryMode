package com.example.factory.factoryMethod;

public class HighShoe extends Shoe {

	public HighShoe(){}
	
	@Override
	public void prepare(){
		System.out.println("HighShoe_prepare");
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
