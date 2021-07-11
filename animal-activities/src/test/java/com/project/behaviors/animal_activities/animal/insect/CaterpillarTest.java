package com.project.behaviors.animal_activities.animal.insect;

import static org.mockito.Mockito.withSettings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.behaviors.animal_activities.Activity;

@ExtendWith(MockitoExtension.class)
public class CaterpillarTest {
	
	@Mock
	private Caterpillar caterpillar;
	
	@Test
	public void testSuperClassMethod() {
		caterpillar.walk();
		Mockito.verify(caterpillar, Mockito.times(1)).walk();
	}
	
	@Test
	public void testTransform() {
		Activity activity = Mockito.mock(Activity.class);
		caterpillar = Mockito.mock(Caterpillar.class, withSettings() 
				.useConstructor(activity).defaultAnswer(Mockito.CALLS_REAL_METHODS));
		Butterfly butterfly = caterpillar.transformToButterfly();
		
		Assertions.assertNotNull(butterfly);
		Assertions.assertEquals(Butterfly.class, butterfly.getClass());
		Mockito.verify(caterpillar, Mockito.times(1)).transformToButterfly();
		
	}

}
