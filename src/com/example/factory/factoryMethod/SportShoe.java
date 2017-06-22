package com.example.factory.factoryMethod;

public class SportShoe extends Shoe{

	public SportShoe(){}
	
	@Override
	public void prepare(){
		System.out.println("SportShoe_prepare");
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
