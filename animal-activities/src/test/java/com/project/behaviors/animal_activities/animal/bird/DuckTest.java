package com.project.behaviors.animal_activities.animal.bird;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DuckTest {
	
	@Mock
	private Duck duck;
	
	@Test
	public void testSing() {
		duck.sing();
		Mockito.verify(duck, Mockito.times(1)).sing();
	}
	
	@Test
	public void testSwim() {
		duck.swim();
		Mockito.verify(duck, Mockito.times(1)).swim();
	}
	
	@Test
	public void testSuperClassMethods() {
		duck.fly();	
		 
	    Mockito.verify(duck, Mockito.times(1)).fly();
	    
	    duck.walk();
	    
	    Mockito.verify(duck, Mockito.times(1)).walk();
	}

}
