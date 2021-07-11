package com.project.behaviors.animal_activities.animal.bird;

import static org.mockito.Mockito.withSettings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.behaviors.animal_activities.Activity;

@ExtendWith(MockitoExtension.class)
public class BirdTest {
	
	@Test
	public void givenNonAbstractMethodWhenMockTestBehaviour() {
		Activity activity = Mockito.mock(Activity.class);
	    Bird bird =  Mockito.mock(Bird.class, 
	    		withSettings() .useConstructor(activity)
	    		.defaultAnswer(Mockito.CALLS_REAL_METHODS));
	    
	    bird.fly();	
	 
	    Mockito.verify(activity, Mockito.times(1)).fly();
	    Mockito.verify(bird, Mockito.times(1)).fly();
	    
	    bird.walk();
	    
	    Mockito.verify(activity, Mockito.times(1)).walk();
	    Mockito.verify(bird, Mockito.times(1)).walk();
	}

}
