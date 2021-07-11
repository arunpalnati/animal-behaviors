package com.project.behaviors.animal_activities.animal.bird;

import com.project.behaviors.animal_activities.Activity;
import com.project.behaviors.animal_activities.animal.Animal;

public abstract class Bird implements Animal {
	
	protected Activity activity;
	
	protected Bird(Activity activity) {
		this.activity = activity;
	}
	
	public void fly() {
		activity.fly();
	}
	
	public void walk() {
		activity.walk();
	}
	
	protected abstract void sing();

}
