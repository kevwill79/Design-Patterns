package strategy.jUnitTest;

import org.junit.jupiter.api.Test;

import strategy.Animal;
import strategy.Cat;
import strategy.Dog;
import strategy.Duck;
import strategy.Human;
import strategy.encapsulatedSoundBehavior.Talk;
import strategy.encapsulatedWalkingBehavior.Mittens;

class AnimalTest {
	
	Animal cat = new Cat();
	Animal dog = new Dog();
	Animal duck = new Duck();
	Animal human = new Human();
	
	@Test
	void testDisplayMyBehaviors() {
		cat.displayMyBehaviors();
		dog.displayMyBehaviors();
		duck.displayMyBehaviors();
		human.displayMyBehaviors();
	}
	
	@Test
	void testDynamicBehaviors() {
		cat.setSoundBehavior(new Talk());
		duck.setWalkingBehavior(new Mittens());
	}
}