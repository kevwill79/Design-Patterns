package strategy;

import strategy.encapsulatedSoundBehavior.SoundBehavior;
import strategy.encapsulatedSpecies.Species;
import strategy.encapsulatedWalkingBehavior.WalkingBehavior;

public abstract class Animal {
	
	/* Each animal object will set these variables polymorphically
	 * to reference the specific behavior type it will use at runtime 
	 * e.g.(Bark, WebbedFeet, Feline, etc.)
	 */
	
	//Variables to implement the interfaces
	SoundBehavior soundBehavior;
	WalkingBehavior walkingBehavior;
	Species species;
	
	public Animal() {
		System.out.println("I'm an animal but ...");
	}
	
	//Abstract method will be overridden and defined in the subclasses
	public abstract void displayMyBehaviors();
	
	/* eat() and sleep() are trivial methods used to 
	 * illustrate the parts of the application that stay the same
	 */
	public void eat(){
		System.out.println("All animals eat");
	}
	
	public void sleep() {
		System.out.println("All animals sleep");
	}
	
	/* speciesType(), makeSound() and walkingStyle() are used to
	 * illustrate the parts that change and therefore is encapsulated
	 */
	
	//The Animal object delegates the behavior handling 
	//to the interface types declared above
	public void speciesType() {
		species.whatAmI();
	}
	
	public void makeSound() {
		soundBehavior.sound();
	}

	public void walkingStyle() {
		walkingBehavior.walk();
	}
	
	//Used to set the behaviors dynamically
	public void setSoundBehavior(SoundBehavior sb) {
		this.soundBehavior = sb;
	}
	
	public void setWalkingBehavior(WalkingBehavior wb) {
		this.walkingBehavior = wb;
	}
}
