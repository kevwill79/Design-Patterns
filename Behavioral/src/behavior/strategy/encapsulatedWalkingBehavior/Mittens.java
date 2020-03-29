package behavior.strategy.encapsulatedWalkingBehavior;

public class Mittens implements WalkingBehavior{
	
	@Override
	public void walk() {
		System.out.println("I walk on my mittens");
	}
}
