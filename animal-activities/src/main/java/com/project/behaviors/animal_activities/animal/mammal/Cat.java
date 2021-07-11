package com.project.behaviors.animal_activities.animal.mammal;

import com.project.behaviors.animal_activities.Activity;

public class Cat extends Mammal {

	public Cat(Activity activity) {
		super(activity);
	}

	@Override
	public void sing() {
		activity.sing("Meow Meow");	
	}
	
}
