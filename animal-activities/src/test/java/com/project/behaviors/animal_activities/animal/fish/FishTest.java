package com.project.behaviors.animal_activities.animal.fish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FishTest {
	
	@Mock
	private Fish fish;
	
	@Test
	public void testSwim() {
		fish.swim();
		Mockito.verify(fish, Mockito.times(1)).swim();
	}

}
