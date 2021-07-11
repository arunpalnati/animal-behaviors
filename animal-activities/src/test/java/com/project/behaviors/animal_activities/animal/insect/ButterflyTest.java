package com.project.behaviors.animal_activities.animal.insect;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ButterflyTest {
	
	@Mock
	private Butterfly butterfly;
	
	@Test
	public void testFly() {
		butterfly.fly();
		Mockito.verify(butterfly, Mockito.times(1)).fly();
	}
	
	@Test
	public void testSuperClassMethod() {
		butterfly.walk();
		Mockito.verify(butterfly, Mockito.times(1)).walk();
	}

}
