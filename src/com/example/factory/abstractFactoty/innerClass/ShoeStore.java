package com.example.factory.abstractFactoty.innerClass;

/**
 * 
 * @author xuyusong
 * @see 工厂方法
 */
public abstract class ShoeStore {
	
	public ShoeStore(){}
	
	public Shoe orderShoe(String type){
		Shoe shoe = null ;
/*		if(type.equals("High")){
			shoe = new HighShoe();
		}else if(type.equals("Leather")){
			shoe = new LeatherShoe();
		}else if(type.equals("Sport")){
			shoe = new SportShoe();
		}*/
		shoe = createShoe(type);
		//准备
		shoe.prepare();
		//裁剪
		shoe.cut();
		//组装
		shoe.assemble();
		return shoe;
	}
	 abstract Shoe createShoe(String type);
}
