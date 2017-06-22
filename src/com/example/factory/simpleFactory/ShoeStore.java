package com.example.factory.simpleFactory;

/**
 * 
 * @author xuyusong
 * @see 简单工厂
 *
 */
public class ShoeStore {
	
	public ShoeStore(){}
	
	public Shoe orderShoe(String type){
		Shoe shoe = null ;
		//简单工厂
		shoe = SimpleShoeFactory.createShoe(type);
		//准备
		shoe.prepare();
		//裁剪
		shoe.cut();
		//组装
		shoe.assemble();
		return shoe;
	}

}
