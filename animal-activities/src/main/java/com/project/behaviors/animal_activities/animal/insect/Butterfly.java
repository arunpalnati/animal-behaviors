package com.project.behaviors.animal_activities.animal.insect;

import com.project.behaviors.animal_activities.Activity;

public class Butterfly extends Insect{
	
	public Butterfly(Activity activity) {
		super(activity);
	}
	
	public void fly() {
		activity.fly();
	}

}
