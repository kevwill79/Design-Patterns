package strategy;

import strategy.encapsulatedSoundBehavior.Bark;
import strategy.encapsulatedSpecies.Canine;
import strategy.encapsulatedWalkingBehavior.Paws;

public class Dog extends Animal{
	
	public Dog() {
		/* When a Dog object is instantiated, this constructor initializes
		/* the inherited behavior variables to dog specific behaviors
		 */
		species = new Canine();
		soundBehavior = new Bark();
		walkingBehavior = new Paws();
		
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
