package strategy.encapsulatedSoundBehavior;

public class Talk implements SoundBehavior{

	@Override
	public void sound() {
		System.out.println("I make sounds by talking");
	}

}
