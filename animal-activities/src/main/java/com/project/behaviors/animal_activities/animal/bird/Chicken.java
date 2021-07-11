package com.project.behaviors.animal_activities.animal.bird;

import com.project.behaviors.animal_activities.Activity;
import com.project.behaviors.animal_activities.animal.Animal;

public class Chicken implements Animal {

	Activity activity;
	
	public Chicken(Activity activity) {
		this.activity = activity;
	}

	public void sing() {
		activity.sing("Cluck Cluck");
	}
	
	public void walk() {
		activity.walk();
	}

}
