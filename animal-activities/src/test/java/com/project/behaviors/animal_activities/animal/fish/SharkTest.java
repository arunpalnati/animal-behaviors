package com.project.behaviors.animal_activities.animal.fish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SharkTest {
	
	@Mock
	private Shark shark;
	
	@Test
	public void testSuperClassMethods() {
		shark.swim();
		Mockito.verify(shark, Mockito.times(1)).swim();
	}
	
	@Test
	public void testEat() {
		shark.eat();
		Mockito.verify(shark, Mockito.times(1)).eat();
	}

}
