package creational.factory;

import java.util.ArrayList;

public abstract class Burger {
	String burgerType, bunType;
	ArrayList<String> condiments = new ArrayList<String>();
	
	public Burger(String burgerType, String bunType, 
			ArrayList<String> condiments) {
		
		this.burgerType = burgerType;
		this.bunType = bunType;
		
		for(int i = 0; i < condiments.size(); i++)
			condiments.get(i);
	}
	
	void prepareBurger() {
		System.out.println("You ordered a " + burgerType + " on " 
							+ bunType + " buns");
		System.out.println();
	}
	
	public String getBurgerType() {
		return burgerType;
	}
	
	public String getBunType() {
		return bunType;
	}
	
	public ArrayList<String> getCondiments() {
		return condiments;
	}
}


