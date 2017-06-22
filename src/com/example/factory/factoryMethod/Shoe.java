package com.example.factory.factoryMethod;

public  class Shoe {
	
	public Shoe(){}
	
	public void prepare(){
		System.out.println("prepare");
	}
	
	public void cut(){
		System.out.println("cut");
	}

	public void assemble(){
		System.out.println("assemble");
	}
}
