package com.project.behaviors.animal_activities.animal.mammal;

import com.project.behaviors.animal_activities.Activity;

public class Dog extends Mammal {

	public Dog(Activity activity) {
		super(activity);
	}

	@Override
	public void sing() {
		activity.sing("Woof Woof");	
	}
	
}
