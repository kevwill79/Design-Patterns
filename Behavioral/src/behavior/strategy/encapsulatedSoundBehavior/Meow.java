package behavior.strategy.encapsulatedSoundBehavior;

public class Meow implements SoundBehavior{
	
	@Override
	public void sound() {
		System.out.println("I make sounds by meowing");
	}
}
