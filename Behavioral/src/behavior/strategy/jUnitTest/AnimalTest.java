package behavior.strategy.jUnitTest;

import org.junit.jupiter.api.Test;

import behavior.strategy.Animal;
import behavior.strategy.Cat;
import behavior.strategy.Dog;
import behavior.strategy.Duck;
import behavior.strategy.Human;
import behavior.strategy.encapsulatedSoundBehavior.Talk;
import behavior.strategy.encapsulatedWalkingBehavior.Mittens;

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