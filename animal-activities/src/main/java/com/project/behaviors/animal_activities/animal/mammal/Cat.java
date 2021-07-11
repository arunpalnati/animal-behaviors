package com.project.behaviors.animal_activities.animal.mammal;

import com.project.behaviors.animal_activities.Activity;

public class Cat extends Mammal {

	protected Cat(Activity activity) {
		super(activity);
	}

	@Override
	protected void sing() {
		activity.sing("Meow Meow");	
	}
	
}
