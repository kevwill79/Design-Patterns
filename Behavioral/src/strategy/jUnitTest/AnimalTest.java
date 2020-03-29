package strategy.jUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import strategy.Animal;
import strategy.Cat;
import strategy.Dog;
import strategy.Duck;
import strategy.Human;
import strategy.encapsulatedSoundBehavior.SoundBehavior;
import strategy.encapsulatedSoundBehavior.Talk;
import strategy.encapsulatedSpecies.Species;
import strategy.encapsulatedWalkingBehavior.Mittens;
import strategy.encapsulatedWalkingBehavior.WalkingBehavior;

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

/*@Test
void testAnimal() {
SoundBehavior sb;
WalkingBehavior wb;
Species s;

Animal cat = new Cat();
Animal dog = new Dog();
Animal Duck = new Duck();
Animal Human = new Human();
}

@Test
void test() {
assertNotNull(cat);
assertNotSame(cat, dog);

}*/