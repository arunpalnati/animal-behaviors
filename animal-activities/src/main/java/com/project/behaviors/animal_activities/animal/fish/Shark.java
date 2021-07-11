package com.project.behaviors.animal_activities.animal.fish;

import com.project.behaviors.animal_activities.Activity;

public class Shark extends Fish{

	public Shark(Activity activity) {
		super(activity, "large", "grey");
	}
	
	public void eat() {
		activity.eat("fish");
	}

}
