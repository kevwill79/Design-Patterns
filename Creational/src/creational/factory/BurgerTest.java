package creational.factory;

import java.util.ArrayList;

public class BurgerTest {
	
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("lettuce");
		s.add("ketchup");
		
		for(String i: s)
			System.out.print(i + " ");
	}
}
