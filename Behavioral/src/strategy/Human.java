package strategy;

import strategy.encapsulatedSoundBehavior.Talk;
import strategy.encapsulatedSpecies.Homosapien;
import strategy.encapsulatedWalkingBehavior.Feet;

public class Human extends Animal{
	
	public Human() {
		/* When a Human object is instantiated, this constructor initializes
		/* the inherited behavior variables to human specific behaviors
		 */
		species = new Homosapien();
		soundBehavior = new Talk();
		walkingBehavior = new Feet();
		
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
