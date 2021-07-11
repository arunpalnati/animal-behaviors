package com.project.behaviors.animal_activities.animal.bird;

import java.lang.reflect.InvocationTargetException;

import com.project.behaviors.animal_activities.Activity;

public class Parrot extends Bird{
	
	private Object object;
	
	public Parrot (Object object, Activity activity) {
		super(activity);
		this.object = object;
	}

	@Override
	public void sing() {
		
		if(object != null) {
			try {
				object.getClass().getMethod("sing").invoke(object);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
		else {
			activity.sing("Squawk Squawk");
		}
		
	}

}
