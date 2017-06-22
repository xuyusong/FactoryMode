package com.example.factory.abstractFactoty;

public class AdidasMaterialFactory extends MaterialFactory {

	@Override
	public String preCloth() {
		// TODO Auto-generated method stub
		System.out.println("prepare Adidas cloth");
		return "Adidas_Cloth";
	}

	@Override
	public String preModel() {
		// TODO Auto-generated method stub
		System.out.println("prepare Adidas Model");
		return "Adidas_Model";
	}
}
