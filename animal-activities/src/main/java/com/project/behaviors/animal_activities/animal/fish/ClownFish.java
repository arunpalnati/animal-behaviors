package com.project.behaviors.animal_activities.animal.fish;

import com.project.behaviors.animal_activities.Activity;

public class ClownFish extends Fish{

	public ClownFish(Activity activity) {
		super(activity, "small", "orange");
	}
	
	public void joke() {
		activity.joke();
	}
}
