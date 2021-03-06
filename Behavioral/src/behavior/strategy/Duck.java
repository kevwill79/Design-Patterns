package behavior.strategy;

import behavior.strategy.encapsulatedSoundBehavior.Quack;
import behavior.strategy.encapsulatedSpecies.WaterFowl;
import behavior.strategy.encapsulatedWalkingBehavior.WebbedFeet;

public class Duck extends Animal{
	
	public Duck() {
		/* When a Duck object is instantiated, this constructor initializes
		/* the inherited behavior variables to duck specific behaviors
		 */
		species = new WaterFowl();
		soundBehavior = new Quack();
		walkingBehavior = new WebbedFeet();
		
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
