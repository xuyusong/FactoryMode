package com.example.factory.abstractFactoty;

public class NikeMaterialFactory extends MaterialFactory {

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
}
