package com.project.behaviors.animal_activities.animal.fish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DolphinTest {
	
	@Mock
	private Dolphin dolphin;
	
	@Test
	public void testSwim() {
		dolphin.swim();
		Mockito.verify(dolphin, Mockito.times(1)).swim();
	}

}
