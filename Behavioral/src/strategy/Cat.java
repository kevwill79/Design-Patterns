package strategy;

import strategy.encapsulatedSoundBehavior.Meow;
import strategy.encapsulatedSpecies.Feline;
import strategy.encapsulatedWalkingBehavior.Mittens;

public class Cat extends Animal{
	
	public Cat() {
		/* When a Cat object is instantiated, this constructor initializes
		/* the inherited behavior variables to cat specific behaviors
		 */
		species = new Feline();
		soundBehavior = new Meow();
		walkingBehavior = new Mittens();
		
		//Behaviors that are the same for all animals
		eat();
		sleep();
	}
	
	@Override
	public void displayMyBehaviors() {
		speciesType();
		makeSound();
		walkingStyle();
		System.out.println();
	}
}
