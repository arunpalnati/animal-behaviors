package com.project.behaviors.animal_activities.animal.bird;

import com.project.behaviors.animal_activities.Activity;

public class Duck extends Bird{

	public Duck(Activity activity) {
		super(activity);
	}

	@Override
	public void sing() {
		activity.sing("Quack Quack");
	}
	
	public void swim() {
		activity.swim();
	}
	

}
