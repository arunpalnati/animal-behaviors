package com.project.behaviors.animal_activities.animal.bird;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ChickenTest {

	@Mock
	private Chicken chicken;
	
	@Test
	public void testSing() {
		chicken.sing();
		Mockito.verify(chicken, Mockito.times(1)).sing();
	}
	
	@Test
	public void testWalk() {
	    
	    chicken.walk();
	    
	    Mockito.verify(chicken, Mockito.times(1)).walk();
	}
}
