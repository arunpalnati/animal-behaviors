package com.project.behaviors.animal_activities.animal.bird;

import com.project.behaviors.animal_activities.Activity;

public class Rooster {
	
	//Rooster is a male chicken and Bird, not using inheritance as per given question
	private Activity activity;
	
	public Rooster(Activity activity) {
		this.activity = activity;
	}
	
	public void sing() {
		activity.sing("Cock-a-doodle-doo");
	}
	
	public void walk() {
		activity.walk();
	}
	
	public void fly() {
		activity.fly();
	}

}
