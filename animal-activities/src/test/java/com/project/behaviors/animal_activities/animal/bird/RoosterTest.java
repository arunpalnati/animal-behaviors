package com.project.behaviors.animal_activities.animal.bird;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RoosterTest {
	
	@Mock
	private Rooster rooster;
	
	@Test
	public void testSing() {
		rooster.sing();
		Mockito.verify(rooster, Mockito.times(1)).sing();
	}
	
	@Test
	public void testFly() {
		rooster.fly();	
	    Mockito.verify(rooster, Mockito.times(1)).fly();
	}
	
	@Test
	public void testWalk() { 
		rooster.walk();
	    Mockito.verify(rooster, Mockito.times(1)).walk();
	}

}
