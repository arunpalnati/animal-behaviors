package com.project.behaviors.animal_activities.animal.insect;

import com.project.behaviors.animal_activities.Activity;

public class Caterpillar extends Insect {

	protected Caterpillar(Activity activity) {
		super(activity);
	}
	
	public Butterfly transformToButterfly() {
		return new Butterfly(activity);
	}

}
