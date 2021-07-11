package com.project.behaviors.animal_activities.animal.mammal;

import com.project.behaviors.animal_activities.Activity;

public class Dog extends Mammal {

	protected Dog(Activity activity) {
		super(activity);
	}

	@Override
	protected void sing() {
		activity.sing("Woof Woof");	
	}
	
}
