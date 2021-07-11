package com.project.behaviors.animal_activities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ActivityTest {
	
	@Mock
	private Activity activity;

	@Test
	public void testFly() {
		activity.fly();
		Mockito.verify(activity, Mockito.times(1)).fly();
	}
	
	@Test
	public void testWalk() {
		activity.walk();
		Mockito.verify(activity, Mockito.times(1)).walk();
	}
	
	@Test
	public void testSing() {
		activity.sing("Test case");
		Mockito.verify(activity, Mockito.times(1)).sing(Mockito.anyString());
	}
	
	@Test
	public void testSwim() {
		activity.swim();
		Mockito.verify(activity, Mockito.times(1)).swim();
	}


}
