package com.project.behaviors.animal_activities.animal.fish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClownFishTest {
	
	@Mock
	private ClownFish clownFish;
	
	@Test
	public void testSuperClassMethods() {
		clownFish.swim();
		Mockito.verify(clownFish, Mockito.times(1)).swim();
	}
	
	@Test
	public void testJoke() {
		clownFish.joke();
		Mockito.verify(clownFish, Mockito.times(1)).joke();
	}

}
