package strategy.encapsulatedSoundBehavior;

public class Bark implements SoundBehavior{
	
	@Override
	public void sound() {
		System.out.println("I make sounds by barking");
	}
}
