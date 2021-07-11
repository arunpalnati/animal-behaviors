package com.project.behaviors.animal_activities.animal.mammal;

import com.project.behaviors.animal_activities.Activity;
import com.project.behaviors.animal_activities.animal.Animal;

public abstract class Mammal implements Animal{
	
protected Activity activity;
	
	protected Mammal(Activity activity) {
		this.activity = activity;
	}
	
	public void walk() {
		activity.walk();
	}
	
	protected abstract void sing();

}
