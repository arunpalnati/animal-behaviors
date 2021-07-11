package com.project.behaviors.animal_activities.animal.bird;

import static org.mockito.Mockito.withSettings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.behaviors.animal_activities.Activity;

@ExtendWith(MockitoExtension.class)
public class ParrotTest {
	
	@Mock
	private Parrot parrot;
	
	@Test
	public void testSuperClassMethods() {
		parrot.fly();	
		 
	    Mockito.verify(parrot, Mockito.times(1)).fly();
	    
	    parrot.walk();
	    
	    Mockito.verify(parrot, Mockito.times(1)).walk();
	}
	
	@Test
	public void testSing() {
		Duck duck = Mockito.mock(Duck.class);
		Activity activity = Mockito.mock(Activity.class);
		parrot = Mockito.mock(Parrot.class, withSettings().useConstructor(duck, activity)
				.defaultAnswer(Mockito.CALLS_REAL_METHODS));
		
		parrot.sing();
		
		Mockito.verify(duck, Mockito.times(1)).sing();
		Mockito.verify(parrot, Mockito.times(1)).sing();
		
		Rooster rooster = Mockito.mock(Rooster.class);
		
		parrot = Mockito.mock(Parrot.class, withSettings().useConstructor(rooster, activity)
				.defaultAnswer(Mockito.CALLS_REAL_METHODS));
		
		parrot.sing();
		
		Mockito.verify(rooster, Mockito.times(1)).sing();
		Mockito.verify(parrot, Mockito.times(1)).sing();
		
	}

}
