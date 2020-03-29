package strategy.encapsulatedWalkingBehavior;

public class Feet implements WalkingBehavior{
	
	@Override
	public void walk() {
		System.out.println("I walk on my feet");
	}
}
