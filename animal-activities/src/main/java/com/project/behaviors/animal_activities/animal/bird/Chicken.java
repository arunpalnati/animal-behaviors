package com.project.behaviors.animal_activities.animal.bird;

import com.project.behaviors.animal_activities.Activity;

public class Chicken extends Bird {

	public Chicken(Activity activity) {
		super(activity);
	}

	@Override
	public void sing() {
		activity.sing("Cluck Cluck");
	}

}
