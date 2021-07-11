package com.project.behaviors.animal_activities.animal.insect;

import com.project.behaviors.animal_activities.Activity;
import com.project.behaviors.animal_activities.animal.Animal;

public abstract class Insect implements Animal {
	
	protected Activity activity;
	
	protected Insect(Activity activity) {
		this.activity = activity;
	}
	
	public void walk() {
		activity.walk();
	}

}
