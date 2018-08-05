package com.hmily.pattern.factory.simplefactory;

/**
 * ����������
 * @author zyzhmily
 *
 */
public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		Pizza pizza=null;
		
		if(type.equals("cheese")){
			pizza=new CheesePizza();
		}else if(type.equals("***")){
			//pizza = new ***Pizza();
		}
		return pizza;
	}

}
