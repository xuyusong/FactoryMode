package com.example.factory.abstractFactoty;

public class mainTest {

	
	public static void main(String[] args) {
		ShoeStore shoeStore = new AdidasStore();
		shoeStore.orderShoe("High");
		ShoeStore shoeStore1 =new NikeStore();
		shoeStore1.orderShoe("Sport");
	}
}
