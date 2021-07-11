package com.project.behaviors.animal_activities.animal.insect;

import static org.mockito.Mockito.withSettings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.behaviors.animal_activities.Activity;

@ExtendWith(MockitoExtension.class)
public class InsectTest {
	
	@Test
	public void givenNonAbstractMethodWhenMockTestBehaviour() {
		Activity activity = Mockito.mock(Activity.class);
	    Insect insect =  Mockito.mock(Insect.class, 
	    		withSettings() .useConstructor(activity)
	    		.defaultAnswer(Mockito.CALLS_REAL_METHODS));
	    
	    insect.walk();	
	 
	    Mockito.verify(activity, Mockito.times(1)).walk();
	    Mockito.verify(insect, Mockito.times(1)).walk();
	    
	}

}
