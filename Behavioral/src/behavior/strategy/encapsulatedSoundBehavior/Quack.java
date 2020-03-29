package behavior.strategy.encapsulatedSoundBehavior;

public class Quack implements SoundBehavior{
	
	@Override
	public void sound() {
		System.out.println("I make sounds by quacking");
	}
}
