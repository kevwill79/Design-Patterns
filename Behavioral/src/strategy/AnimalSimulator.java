package strategy;

import strategy.encapsulatedSoundBehavior.Talk;
import strategy.encapsulatedWalkingBehavior.Paws;

public class AnimalSimulator {
	
	public static void main(String[] args) {
		Animal Ted = new Human();
		Ted.displayMyBehaviors();
		
		Animal Goofy = new Dog();
		Goofy.displayMyBehaviors();
		
		Animal Daffy = new Duck();
		Daffy.displayMyBehaviors();
		
		Animal Tom = new Cat();
		Tom.displayMyBehaviors();
		
		System.out.println("Now cats are talking and ducks have paws\n");
		
		//Setting behavior dynamically
		Tom.setSoundBehavior(new Talk());
		Daffy.setWalkingBehavior(new Paws());
		
		//The Animal constructor will not run this time
		Tom.displayMyBehaviors();
		Daffy.displayMyBehaviors();
	}
}
